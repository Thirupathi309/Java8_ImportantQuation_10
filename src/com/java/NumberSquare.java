package com.java;

import java.util.Arrays;
import java.util.List;

public class NumberSquare {

	public static void main(String[] args){
		List<Integer> numbers=Arrays.asList(1,10,20,30,15);
		numbers.stream().map(t->t*t).forEach(n->System.out.println(n));

}
}