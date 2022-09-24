package com.stackandqueue;

public class Stack <Type extends Comparable<Type>> extends LinkedList<Type>{
	/*
	 * Last In First Out (LIFO) and First In Last Out (FILO) principle
	 */
	Stack() {
		super();
	}

	/**
	 * add item to the top of the stack
	 * @param item
	 */
	public void push(Type item) {
		super.add(item);
	}
	
	/**
	 * return item from the top of stack then remove element from top and shift top to the next element
	 */
	@Override
	public Type pop() {
		return super.pop();
	}
	
	/**
	 * returns the element at top position of the stack and do nothing operations
	 * @return head item from linked list
	 */
	public Type peek() {
		return super.headItem();
	}
}
