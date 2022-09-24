package com.stackandqueue;

public class Queue <Type extends Comparable<Type>> extends LinkedList<Type>{
	/*
	 * First In First Out (FIFO) and Last In Last Out (LILO) principle
	 */
	Queue() {
		super();
	}
	
	/**
	 * add item at rear side of queue
	 * @param item
	 */
	public void enqueue(Type item) {
		super.append(item);
	}
	
	/**
	 * return item from the front side of queue then remove item from front and shift front to the next element
	 * @return
	 */
	public Type dequeue() {
		return super.pop();
	}
}