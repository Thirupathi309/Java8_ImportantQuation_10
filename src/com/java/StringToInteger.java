package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInteger {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("2", "332", "88", "22", "248", "325");

		List<Integer> collect = numbers.stream().map(t -> Integer.parseInt(t)).filter(i -> i % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}