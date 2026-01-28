package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumNumbers {
	public static void main(String[] args){
		List<Integer> numbers=Arrays.asList(5,3,2,1);
		Optional<Integer>sum=numbers.stream().reduce((a,b)->a+b);
		System.out.println("The sum of the Number is:"+sum.get());
	}
}

import java.io.*;
class GFG {

    static int sum(int[] arr, int n)
    {

        // base or terminating condition
        if (n <= 0) {
            return 0;
        }

        // Calling method recursively
        return sum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args)
    {

        int arr[] = { 12, 3, 4, 15 };
        int s = sum(arr, arr.length);

        System.out.println(s);
    }
}
\\ THIS ISUPDATED CODE i NEED TO PULL IT 
