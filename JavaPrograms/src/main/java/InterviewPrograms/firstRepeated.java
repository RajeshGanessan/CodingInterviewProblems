package InterviewPrograms;

import java.util.HashMap;
import java.util.Scanner;

public class firstRepeated {

	
	public static void main(String[] args) {
		
		
		System.out.println("check the first non repeated character");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char c = firstNonCharacter(str);
		System.out.println("The first non repeated Character is " + c);
	}

	private static Character firstNonCharacter(String str) {
		// TODO Auto-g	enerated method stub
		
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		
		char c;
		int i;
		
		for( i=0;i<str.length();i++) {
			
			c= str.charAt(i);
			
			if(map.containsKey(c)) {
				
				
				map.put(c,map.get(c)+1);
			}
			
			else {
				
				map.put(c, 1);
			}
			
		}
		
		for(i=0;i<str.length();i++) {
			
			c = str.charAt(i);
			if(map.get(c)==1) {
				
				return c;
			}
		}
		
		return null;
	}
}

