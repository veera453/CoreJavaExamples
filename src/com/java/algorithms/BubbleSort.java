package com.java.algorithms;

public class BubbleSort {
	
	public static int[] bubbleSort(int[] arr) {
		int n=arr.length;
		boolean swapped= false;
		for(int i=0;i<n-1;i++) {
			swapped=false;
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) break;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] unsortedArray = {64, 11, 55, 5, 30, 90, 1, 53};
		System.out.println("unsorted array");
		for(int c: unsortedArray) {
			System.out.print(c +" ");
		}
		
		bubbleSort(unsortedArray);
		System.out.println("\nsorted array");
		for(int c: unsortedArray) {
			System.out.print(c+ " ");
		}
		
	}

}
