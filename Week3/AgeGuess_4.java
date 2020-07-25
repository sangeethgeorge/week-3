package Week3;

import java.util.Random;
import java.util.Scanner;

public class AgeGuess_4 {

	private static Scanner scan;

	public static void main(String[] args) {
		Random gen = new Random();
		int age = gen.nextInt(100);
		scan = new Scanner (System.in);
		System.out.println("Guess age:");
 		int ageGuess = scan.nextInt();
 		while(ageGuess!= age) 
 			{
 	 		System.out.println("Guess Again: ");
 			scan = new Scanner(System.in);
 			int ageGuess1 = scan.nextInt();			
 			if(ageGuess1 == age)
 			{ 
 			System.out.println("Correct!");
 			System.exit(0);	
 			}
 			if(ageGuess1 < age)
 			{
			 System.out.println("older");
 			}
 			if(ageGuess1 > age)
 			{
			 System.out.println("younger");
 			}
 			}
	}

}
