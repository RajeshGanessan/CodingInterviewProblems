package InterviewPrograms;

import java.util.Scanner;

public class reverse {

	
	
	public static void main(String args[]) {
		
		
//		System.out.println("Reversing a String");
//		
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.next();
//		String rev = "";
//		
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			
//			rev= rev+str.charAt(i);
//			
//		}
//		System.out.println("reversed String is = "+rev);
		System.out.println("Enter num to form patterns");
		Scanner sc = new Scanner(System.in);
		
		int Num = sc.nextInt();
		
		for(int i=1;i<=Num;i++) {
			
			
			for(int j=1;j<=i;j++) {
				
				System.out.println(j);
			}
			
		}
		
	}
	
	
	
}
