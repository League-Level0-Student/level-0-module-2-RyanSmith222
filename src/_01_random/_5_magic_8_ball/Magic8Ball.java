//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	
public static void main(String[] args) {
	
String question = JOptionPane.showInputDialog(null, "Enter a question to ask the Magic 8 Ball.");
	
Random ran = new Random();

int number = ran.nextInt(4);

System.out.println(number);
	
if(number == 0) {
	JOptionPane.showMessageDialog(null, "Yes.");
}
	
if(number == 1) {
	JOptionPane.showMessageDialog(null, "No.");
}

if(number == 2) {
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google.");
}

if(number == 3) {
	JOptionPane.showMessageDialog(null, "Stop asking me for answers, and get on with your life.");
}

}
	
	// 1. Make a main method that includes all the steps below

	// 2. Get the user to enter a question for the 8 ball to answer
	

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3

	
	// 4. If the random number is 0

	// -- tell the user "Yes"

	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3

	// -- write your own answer

}
