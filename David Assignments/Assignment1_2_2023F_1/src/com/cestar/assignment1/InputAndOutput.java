package com.cestar.assignment1;

import java.util.Scanner;

public class InputAndOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Assignment 1: Receives a name, age and annual pay from user
		// and then prints the information in the console.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter your name: ");
		String name = sc.nextLine();
		System.out.print("Please enter your age: ");
		int age = sc.nextInt();
		System.out.print("Please enter your desired annual pay: ");
		double annualPay = sc.nextDouble();
		
		System.out.print("My name is " + name + ", my age is " + age + ", and I hope " +
						"to earn $ " + annualPay + " per year.");
	}

}
