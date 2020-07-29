package InterviewPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	
	
	public static void main(String[] args) {
	
		
		System.out.println("Checking palindrome");
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		if(isPalindrome(number)) {
			
			System.out.println(number +" is a Palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
	
	
	public static boolean isPalindrome(int number) {
		
		
		int palindrome = number;
		int reverse =0 ;
		
		while(palindrome!=0) {
			
			int remainder = palindrome%10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome /10;
		}
		
		
		//checking whether it is equal
		if(number == reverse) {
			return true;
		}
		else {
			return false;
		}
	}
}
