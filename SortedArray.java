/* Code to sort elements from given array using set
 * If we pass duplicate elements, it will remove duplicates and print only one element from that duplicate elements
 */

package com.codes;

import java.util.Scanner;
import java.util.TreeSet;

public class SortedArray {
	
	public static Integer[] sortArray(int[] array) {
       
		TreeSet<Integer> ts=new TreeSet();
		
		for(int i=0;i<array.length;i++) {
			ts.add(array[i]);
		}
		//System.out.println(ts);
		return ts.toArray(new Integer[0]);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array :");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter elements in arrays");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.nextInt();
			
		}   
			
		
		Integer[] sortedArray=sortArray(arr);
		
		System.out.println("Sorted array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

	}

}
