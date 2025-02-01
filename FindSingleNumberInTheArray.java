package com.vishal;

import java.util.Scanner;

public class FindSingleNumberInTheArray {
public static int main(String[] args) {
	int n;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the element of array:");
	 n=sc.nextInt();
	int [] nums=new int[n];
	System.out.println("Enter the element of array:");
	for(int i=0;i<n;i++) {
		nums[i]=sc.nextInt();
	}
	int singleNum=0;
	for(int num : nums) {
		singleNum=singleNum ^ num;
	}
	return singleNum;
}
}
