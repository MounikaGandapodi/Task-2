import java.io.*;
import java.util.*;
public class GuessNumber {
	public static void guessnumber_game() {
		Scanner take = new Scanner(System.in);
		int num=1+(int)(100*Math.random());
		int n=5;
		int a,guess,read;
		System.out.println("Try the new game : Guess the Number !!");
		System.out.println(" A number will be genertaed by the system betweeen 1 to 100."+" you have to Guess the number within 5 trails");
		for(a=0;a<5;a++) {
			System.out.println("Guess the number:");
			guess=take.nextInt();
			if(guess>100 || guess <0) {
				System.out.println(" You are out of boundary , Guess the number between 1 to 100");
			}
			else if(num==guess) {
				System.out.println("Brilliant !...You have guessed the number exactly");
				break;
			}
			else if(num<guess && a!=n-1) {
				System.out.println("Oops! number is less than the"+guess+"try again");
			}
			else if(num>guess && a!=n-1) {
				System.out.println("Oops! number is greater than the"+guess+"try again");
			}
		}
		if(a==n) {
			System.out.println("Oh no..No.of attempts are completed to guess the number");
			System.out.println("The generated number is"+num);
			System.out.println("Thank you  for playing......");
			System.out.println("Do you want to play this game again..!!??");
			System.out.println("Enter 1 if YES"+" "+"else enter 0");
			read=take.nextInt();
			if(read==1) {
				guessnumber_game();
			}
			else {
				System.out.println("Thank you..");
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guessnumber_game();
	}

}