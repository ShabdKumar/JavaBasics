package com.naukri;

import java.util.Scanner;

public class NearestSmallestValue {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of Array : ");
		int size = in.nextInt();
		int[] array = new int[size];
		int[] array1 = new int[size];
		System.out.println("Enter the Element in Array : ");
		for(int i=0; i<size; i++)
			array[i] = in.nextInt();
		
		int min = array[0];
		for(int i=0; i<size; i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		
		for(int i=0; i<size; i++) {
			int min1 = array[i];
			int min2 = array[i];
			int distance1 = size, distance2 = size;
			
			if(array[i] == min) {
				array1[i] = -1;
			}
			else {
				for(int j=i-1; j>=0; j--) {
					if(array[i]>array[j]) {
						min1 = array[j];
						distance1 = i-j;
						break;
					}
				}
			
				for(int j=i+1; j<size; j++) {
					if(array[i]>array[j]) {
						min2 = array[j];
						distance2 = j-i;
						break;
					}
				}
			
				if(distance1<distance2) {
					array1[i] = min1;
				} 
				else if(distance1>distance2) {
					array1[i] = min2;
				} 
				else {
					if(min1>=min2)
						array1[i] = min2;
					else
						array1[i] = min1;
				}
				
			}
		}
		
		for(int i : array1)
			System.out.print(i+" ");
	}

}
