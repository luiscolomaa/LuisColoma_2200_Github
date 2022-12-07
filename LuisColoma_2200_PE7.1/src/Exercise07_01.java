/*******************************************
 * @author Luis Coloma
 * 
 */

import java.util.Scanner;
public class Exercise07_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Get number of students
		System.out.print("Enter the number of students: ");
		
		
		
		int numberOfStudents = input.nextInt();
		double[] scores = new double [numberOfStudents]; // array of scores to be input by user
		double best = 0; // The best score to computed ( assume >= 0)
		
		// Read scores & find the best (i.e., the max)
		System.out.print("Enter " + numberOfStudents + " scores: ");
		for (int i = 0;  i < numberOfStudents; i++) {
			scores[i] = input.nextDouble();
			// Check of value read is bigger than the best so-far
			if(scores[i] > best) {
				best = scores[i];
			}
		}
			//Assert: best is the maximum value of all the scores
			//System.out.print("The best is: " + best);
			//Declare  and initialize letter grade string
		char grade;
		//Assign and display grades
		for(int i = 0; i < numberOfStudents; i++) {
			if(scores[i] >= best - 10) grade = 'A';
			else if (scores[i] >= best - 20) grade = 'B';
			else if (scores[i] >= best - 30) grade = 'C';
			else if (scores[i] >= best - 40) grade = 'D';
			else grade = 'F';
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
		}
		
		
		input.close();
	}

}
