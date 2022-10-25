package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Random ran = new Random();
int number1 = ran.nextInt(99 - 1 + 1) + 1; 
int number2 = ran.nextInt(99 - 1 + 1) + 1; 
int number3 = ran.nextInt(99 - 1 + 1) + 1; 
int number4 = ran.nextInt(99 - 1 + 1) + 1; 
int number5 = ran.nextInt(99 - 1 + 1) + 1; 
int number6 = ran.nextInt(99 - 1 + 1) + 1;

JOptionPane.showMessageDialog(null, "Your lottery numbers are " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", and " + number6 + "."  );


/*
for(int count = 0; count < 6; count += 1) {
	int number = ran.nextInt(99 - 1 + 1) + 1; 
	System.out.println(number);
	
//JOptionPane.showMessageDialog(null, "Your six lottery numbers are " + number + " );
}

*/



}
}
