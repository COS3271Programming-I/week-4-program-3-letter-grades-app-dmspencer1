// Dalila Spencer
// 2026-02-12

package dms_week4;

import java.util.Scanner;
public class Program3 {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		String grade_sign;
		
		System.out.println("Enter a test score: ");
		
		int testscore = userinput.nextInt();
		
		int ascii = 74 - (testscore / 10);
		
		if (ascii > 68) {ascii = 70;}
		
		
		
		if (testscore == 100) {ascii = 65; grade_sign = "+";} // was giving output "-@" when 100 was entered
 
		else if (ascii == 70 || testscore == 100) {grade_sign = "";}
		
		else if (testscore % 10 >= 7 && testscore % 10 <= 9) {grade_sign = "+";}
		
		else if (testscore % 10 >= 0 && testscore % 10 <= 2) {grade_sign = "-";}
		
		else grade_sign = "";
		
		System.out.println("Grade = " + (char)ascii + grade_sign); 
		

	}
}
