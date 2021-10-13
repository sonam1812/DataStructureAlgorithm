package com.DSAlgo;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue<T> {
	private ArrayDeque<T> deque = new ArrayDeque<T>();

	public void enqueue(T obj) {
		deque.add(obj);
	}

	public T dequeue() {
		return deque.remove();
	}

	public T peek() {
		return deque.peekFirst();
	}

	public int size() {
		return deque.size();
	}

	public boolean isEmpty() {
		return deque.isEmpty();
	}

	public static void main(String[] args) {
	
}
}
