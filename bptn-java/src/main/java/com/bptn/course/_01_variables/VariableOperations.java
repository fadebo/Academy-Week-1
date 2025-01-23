package com.bptn.course._01_variables;

public class VariableOperations {

	public static void main(String[] args) {
		// Assigning Variables
		int firstNumber = 2; 
		int secondNumber = 4; 
		
		// Using the arithmetic operations (addition, subtraction, multiplication, and division) 
		int additionNumber = firstNumber + secondNumber; //addition 
		int subtractedNumber = secondNumber - firstNumber; //subtraction
		int multipliedNumber = firstNumber * secondNumber; //Multiplication
		int dividedNumber = secondNumber / firstNumber; //division
		
		//Printing out results
		System.out.println("Original values are: " + firstNumber + ", " + secondNumber);
		System.out.println("The addition of the two numbers are: " + additionNumber);
		System.out.println("The subtraction of the two numbers are: " + subtractedNumber);
		System.out.println("The multiplication of the two numbers are: " + multipliedNumber);
		System.out.println("The division of the two numbers are: " + dividedNumber);
		
		//Reassigning values and then printing out the values
		firstNumber = 4;
		secondNumber = 8;
		
		System.out.println("New values are: " + firstNumber + ", " + secondNumber);
		
		//declaring a character and string and the printing out
		char c = 'F';
		String name = "Farrell";
		System.out.println("Character is : " + c);
		System.out.println("My name is: " + name);
		
	}

}
