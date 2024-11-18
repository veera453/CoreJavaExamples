package com.java.logics.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

import com.java.algorithms.BubbleSort;

public class BubbleSortTest {

	@Test
	public void testBubbleSort() {
		int[] input = { 64, 34, 25, 12, 22, 11, 90 };
		int[] expectedOutput = { 11, 12, 22, 25, 34, 64, 90 };

		BubbleSort.bubbleSort(input);
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	public void testBubbleSort_EmptyArray() {
		int[] input = {};
		int[] expectedOutput = {};

		BubbleSort.bubbleSort(input);
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	public void testBubbleSort_SingleElementArray() {
		int[] input = { 1 };
		int[] expectedOutput = { 1 };

		BubbleSort.bubbleSort(input);
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	public void testBubbleSort_SortedArray() {
		int[] input = { 1, 2, 3, 4, 5 };
		int[] expectedOutput = { 1, 2, 3, 4, 5 };

		BubbleSort.bubbleSort(input);
		assertArrayEquals(expectedOutput, input);
	}

	@Test
	public void testBubbleSort_ReverseSortedArray() {
		int[] input = { 5, 4, 3, 2, 1 };
		int[] expectedOutput = { 1, 2, 3, 4, 5 };

		BubbleSort.bubbleSort(input);
		assertArrayEquals(expectedOutput, input);
	}
}
