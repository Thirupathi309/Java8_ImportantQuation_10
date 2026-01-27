 package com.java;

 import java.util.Arrays;
 import java.util.List;
 import java.util.stream.Collectors;

 public class EvenOrOdd {
 	public static void main(String[] args){
 List<Integer>numbers=Arrays.asList(11,2,3,45,67,9,90,87,8,2);

 //Even numbers
 numbers.stream().filter(i->i%2==0).forEach(n->System.out.print(n+","));

// Odd numbers
 numbers.stream().filter(i->i%2!=0).forEach(n->System.out.print(n+","));

 // By using the Collectors
 List<Integer> collect = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
 System.out.println(collect );

 	}
 }


