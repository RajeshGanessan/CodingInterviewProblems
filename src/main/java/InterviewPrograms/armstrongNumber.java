package InterviewPrograms;

import java.util.Scanner;

public class armstrongNumber {
	
	public static void main(String[] args) {
		
		
		System.out.println("Checking whether armstring number or not");
		
		Scanner sc = new Scanner(System.in);
		
		int rem ,temp,sum=0,digits =0;
		int inpNum = sc.nextInt();
		
		
		temp = inpNum;
		
		//counting the digits
		while(temp!=0) {
			
			digits++;
			temp = temp/10;

		}
		
		temp = inpNum;
		
		while(temp!=0) {
			
			rem = temp%10;
			sum = sum+power(rem,digits);
			temp =temp/10;
			
		}
		
		if(inpNum == sum) {
			System.out.println(inpNum + "is a ArmStrong Number");
		}
		else {
			System.out.println(inpNum+ " is not a Armstrong number");
		}
		
	}

	private static int power(int r, int n) {
		
		int c ,p=1;
		
		for(c=1;c<=n;c++) {
			p=p*r;
		}
		return p;
	}
}
