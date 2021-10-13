package com.DSAlgo;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	class less implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return a.compareTo(b);
		}
	}

	class more implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			return b.compareTo(a);
		}
	}

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int[] arr = { 1, 2, 10, 8, 7, 3, 4, 6, 5, 9 };

		for (int i : arr) {
			pq.add(i);
		}
		System.out.println("Printing Priority Queue Heap : " + pq);

		System.out.print("Dequeue elements of Priority Queue ::");
		while (pq.isEmpty() == false) {
			System.out.print(" " + pq.remove());
		}
}
}