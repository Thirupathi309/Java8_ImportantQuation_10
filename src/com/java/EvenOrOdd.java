// package com.java;

// import java.util.Arrays;
// import java.util.List;
// import java.util.stream.Collectors;

// public class EvenOrOdd {
// 	public static void main(String[] args){
// List<Integer>numbers=Arrays.asList(11,2,3,45,67,9,90,87,8,2);

// //Even numbers
// //numbers.stream().filter(i->i%2==0).forEach(n->System.out.print(n+","));

// //Odd numbers
// //numbers.stream().filter(i->i%2!=0).forEach(n->System.out.print(n+","));

// // By using the Collectors
// List<Integer> collect = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
// System.out.println(collect );

// 	}
// }

// # Python program to check if the input number is odd or even.
// # A number is even if division by 2 gives a remainder of 0.
// # If the remainder is 1, it is an odd number.

// num = int(input("Enter a number: "))
// if (num % 2) == 0:
//    print("{0} is Even".format(num))
// else:
//    print("{0} is Odd".format(num))


// program to check if the number is even or odd
// take input from the user
const number = prompt("Enter a number: ");

//check if the number is even
if(number % 2 == 0) {
    console.log("The number is even.");
}

// if the number is odd
else {
    console.log("The number is odd.");
}
