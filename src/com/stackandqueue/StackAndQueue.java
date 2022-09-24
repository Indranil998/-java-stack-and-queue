package com.stackandqueue;

public class StackAndQueue {

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and queue Program");
		// stack operations
		System.out.println("STACK-----------------");
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println(stack);
		while(!stack.isEmpty()) {
			System.out.println("Peek element is "+stack.peek());
			System.out.println("Pop element is "+stack.pop());
		}
		System.out.println(stack);
		
		// queue operations
		System.out.println("QUEUE----------------");
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		System.out.println(queue);
		while(!queue.isEmpty()) {
			System.out.println("Dequeue element is "+queue.dequeue());
		}
		System.out.println(queue);
	}

}