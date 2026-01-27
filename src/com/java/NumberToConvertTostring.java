package com.java;

import java.util.Arrays;
import java.util.List;

public class NumberToConvertTostring {
	public static void main(String[] args){
List<Integer>numbers=Arrays.asList(2,222,234,567,890,432,236,211,22);
numbers.stream().map(e->String.valueOf(e)).filter(i->i.startsWith("2")).forEach(n->System.out.print(n+","));
//2,222,234,236,211,22,
	}
}
