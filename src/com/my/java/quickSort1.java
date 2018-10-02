package com.my.java;

import java.util.List;

public class quickSort1 {

	public void quickSort(int[] arr,int left, int right) {
		int pivot = Partition(arr, left, right);
		quickSort(arr,left,pivot-1);
		quickSort(arr,pivot+1,right);
	}
	
	
	public int Partition(int[] arr, int left, int right) {
		int pivot = arr[left];
		int high = right;
		int low = left + 1;
       
		
		while (low <= high) {
			while(pivot<arr[low]) {
				low++;
			}
			while(pivot>arr[high]) {
				high--;
			}
			if(low <= high) {
                swap(arr,low,high);
			}
			
		}
		swap(arr,left,high);
		return high;

	}
	
	public void swap(int arr[],int idx1,int idx2) {
		int temp;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}

}
