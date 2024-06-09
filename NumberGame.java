//NUMBER GAME

import java.util.Random;
import java.util.Scanner;

public class NumberGame{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		boolean playAgain=true;
		
		while(playAgain){
			int lb=1;
			int ub=100;
			int numberToGuess=random.nextInt(ub-lb+1)+lb;
			int maxAttempts=8;
			int attempts=0;
			boolean won=false;
			
			System.out.println("Welcome to NUMBER GAME");
			System.out.println("Choose the correct value which i have choosen between "+lb+" and"+ub);
			System.out.println("For this you have total attempts of"+"'"+maxAttempts+"'");
			
			while(attempts<maxAttempts){
				System.out.println("Enter your guess:");
				int userGuess=sc.nextInt();
				attempts++;
				
				if(userGuess==numberToGuess){
					won=true;
					break;
				}
				else if(userGuess<numberToGuess){
					System.out.println("TOO LOW!");
				}
				else{
					System.out.println("TOO HIGH!");
				}
			}
			
			if(won){
				System.out.println("Congratulations! You have guessed the correct number!");
			}
			else{
				System.out.println("You have used all the available attempts!!");
			}
			
			
			System.out.print("Do you want to play again? (yes/no):");
			String response=sc.next();
			
			if(response != "yes"){
				playAgain=false;
			}
		}
		
		System.out.println("Thank You for Playing!");
		sc.close();
	}
}