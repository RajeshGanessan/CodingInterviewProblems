package InterviewPrograms;

import java.util.Scanner;


public class cipherText {

	
	public static void main(String[] args) {
		
		
		System.out.println("Conversion from plainText to cip");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the plainText");
		String text = sc.nextLine();
		System.out.println("Enter the number of shift");
		int shift = sc.nextInt();
		
		String encrypted = "";
		char alphabet ;
		
		for(int i=0;i<text.length();i++) {
			
			alphabet = text.charAt(i);
			System.out.println(alphabet);
			
			if(alphabet>='a' && alphabet <='z') {
				
				alphabet = (char) (alphabet+shift);
				
				if(alphabet>'z') {
					
					alphabet = (char) (alphabet+'a'-'z'-1);
				}
				
				encrypted = encrypted+alphabet;

			}
			
			else if(alphabet>='A' && alphabet<='Z') {
				
				alphabet = (char) (alphabet+shift);
				
				if(alphabet>'Z') {
					
					alphabet = (char) (alphabet+'A'-'Z'-1);
				}
				
				encrypted = encrypted +alphabet;
			}
			
			else {
				
				encrypted = encrypted+alphabet;
			}
		
		}
		
		System.out.println("Encrypted text" + encrypted);
	}
	
}
