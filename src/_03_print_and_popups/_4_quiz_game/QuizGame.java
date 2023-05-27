package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		int score1 = 0;
		String q1 = JOptionPane.showInputDialog("What is the year");
		if (q1.equals("2023")) {
			score1 += 1;
			System.out.println("Your score is " + score1);
		}
			else {
			System.out.println("You got it wrong");
				
		}
		String q2 = JOptionPane.showInputDialog("What is the current president");
		if (q1.equals("joe biden")) {
			score1 += 1;
			System.out.println("Your score is " + score1);
		}
			else {
			System.out.println("You got it wrong");
				
		}
		String q3 = JOptionPane.showInputDialog("What is the best person");
		if (q1.equals("me")) {
			score1 += 1;
			System.out.println("Your score is " + score1);
		}
			else {
			System.out.println("You got it wrong");
				
		}
		// Create a variable to hold the user's score. Set it equal to zero. 

		// ASK A QUESTION AND CHECK THE ANSWER

		// 2.  Ask the user a question 

		// 3.  Use an if statement to check if their answer is correct

		// 4.  if the user's answer was correct, add one to their score 

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer


		// After all the questions have been asked, tell the user their final score 

	}
}
