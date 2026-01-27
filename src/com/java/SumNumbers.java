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