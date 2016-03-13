package com.Session3.Assignment4;

import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class Calculator {
	/*
	 * Problem :
	 * Design a very basic calculator having features like add, subtract, multiply and division.
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number");
		double number1 = scan.nextDouble();
		
		System.out.println("Please enter second number");
		double number2 = scan.nextDouble();
		
		CalculatorClass p = new CalculatorClass(number1,number2);
		System.out.println("Addition of 2 numbers of : "+ p.add());
		System.out.println("subtraction of 2 numbers of : "+ p.subtract());
		System.out.println("multiplaction of 2 numbers of : "+ p.multiply());
		System.out.println("division of 2 numbers of : "+ p.division());
	}
	
}

class CalculatorClass
{
	private double number1;
	private double number2;
	
	public CalculatorClass(double a , double b)
	{
		this.number1 = a;
		this.number2 = b;
	}
	
	public double add()
	{
		return this.number1+this.number2;
		
	}
	public double subtract()
	{
		return this.number1-this.number2;
		
	}
	public double multiply()
	{
		return this.number1*this.number2;
		
	}
	public double division()
	{
		if(this.number2>0){
			return this.number1/this.number2;
		}
		return 0;
		
	}
	
	
}