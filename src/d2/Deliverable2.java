package d2;

import java.util.Scanner;

public class Deliverable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Guess which will have more: heads or tails?");
		
		String  headsOrTailsGuess;
		headsOrTailsGuess = scan.nextLine();
		
		System.out.println(headsOrTailsGuess);
		
		System.out.println("How many times shall we flip a coin?");
		
		int numberOfFlips;
		numberOfFlips=scan.nextInt();
		
		System.out.println(numberOfFlips);
		
		int correctCount = 0;
	
		for (int i=0; i<numberOfFlips;i++) {
			int rand = (int)(Math.random()*2);
			if (rand==0) {
				System.out.println("Heads");
				correctCount++;
			}else if (rand==1) {
				System.out.println("Tails");
			}
		}
		System.out.println("Your guess "+headsOrTailsGuess+ " came up "+correctCount+" time(s).");
	
        System.out.println("That's "+correctCount/numberOfFlips*100 +"%");
		
	}
	

}
