package InterviewPrograms;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {

		System.out.println(" Finding vowels in a string");

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter the String to check the no of vowels");
		String input = sc.nextLine();

		System.out.println("The vowels in the String " + input + " are ");
		countVowels(input);
	}

	private static void countVowels(String input) {
		// TODO Auto-generated method stub

		char ch;
		
		int j=0;
		
		for(int i=0;i<=input.length()-1;i++) {
			
			ch = input.charAt(i);
			
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				j=j+1;	
				System.out.println(ch);		
			}
		}
		System.out.println("The number of vowels in the string are "+ j );
		if(j==0) {
			System.out.println("There are no vowels in the given String");
		}
		
	}
}
