//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
	
for(int count = 0; count < 10; count++) {
	

		
		
		
		int randomNumber = randomMaker.nextInt(5);
	
		System.out.println(randomNumber);
if(randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "You are doing a great job today!");
	
}

if(randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "You should be very proud of yourself!");
	
}

if(randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "Thank you for being a great person!");
	
}

if(randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "You are so nice to everybody!");
	
}

if(randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "Good job on trying your best each day!");
	
}

}




		// 1. Use each value of randomNumber to give the user a random compliment.

		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
