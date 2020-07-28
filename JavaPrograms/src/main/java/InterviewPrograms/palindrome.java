package InterviewPrograms;

import java.util.Scanner;

public class palindrome {

	
	
	public static void main(String[] args) {
		
		
		System.out.println("checking palindrome or not");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String str = input.toLowerCase();
		int start=0;
		int end = str.length()-1;
		
		boolean isPalindrome = true;
		
		while(start<end) {
		
		if(str.charAt(start)!=str.charAt(end)) {
			
			isPalindrome = false;
			break;
		}
		
		start++;
		end--;
	}
	
	if(isPalindrome) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("Not a palindrome");
	}
}
	
	
}
