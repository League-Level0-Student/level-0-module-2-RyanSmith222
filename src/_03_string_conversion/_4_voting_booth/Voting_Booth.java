package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Voting_Booth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String age = JOptionPane.showInputDialog(null, "What is your age?");
	int ageAsInt = Integer.parseInt(age);
	if(ageAsInt >= 18) {
		JOptionPane.showMessageDialog(null, "Who do you think the next president should be?");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nobody cares what you think!");
	}
		
		
		
		
		
		
		
		
		
		
		
	}
}
