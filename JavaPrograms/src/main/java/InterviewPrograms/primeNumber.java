package InterviewPrograms;

import java.util.Scanner;

public class primeNumber {

	
	
	public static void main(String[] args) {
		
		
		System.out.println("Printing Prime numbers");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is prime or not");
		int number = sc.nextInt();
		
		int temp=0;
		
		for(int i=2;i<=number-1;i++) {
			
			if(number%i==0) {
				
				temp = temp+1;
			}
		}
	
		if(temp>0) {
			 
			System.out.println("Not a prime number");
		} else {
			
			System.out.println("Prime number ");
		}
	}
	
	
	public static void checkPrime(int n) {
		
		
		if(n==1 || n==2) {
			
			System.out.println(n + "is not a prime number");
		}
		
		for(int i=2;i<=2;i++);
	}
}
