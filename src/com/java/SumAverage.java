package com.java;

import java.util.Arrays;
import java.util.List;

public class SumAverage {
	public static void main(String[] args){
		List<Integer> numbers=Arrays.asList(1,2,3,4,5);
		Double avg=numbers.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("Print Average Of All Numbers:"+avg);	
	}
	
}
