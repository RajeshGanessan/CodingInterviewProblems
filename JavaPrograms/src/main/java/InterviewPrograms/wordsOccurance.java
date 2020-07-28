package InterviewPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class wordsOccurance {

	
	public static void main(String[] args) {
		
		
		System.out.println("words occurance in String");
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
//		getDuplicateWords(input);
		getDuplicateCharacters(input);
	}
	
	//Finding duplicate words in the String
	static void getDuplicateWords(String input) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
			String[] s = input.split(" ");
			
			for(String temp : s) {
				
					if(map.get(temp)!=null) {
						
						map.put(temp, map.get(temp)+1);
					}
					else {
						map.put(temp, 1);
					}
			}
			
			System.out.println(map);
			
			Iterator<String> TempString  = map.keySet().iterator();
			while(TempString.hasNext()) {
				
				String temp = TempString.next();
				
				if(map.get(temp)>1) {
					
					System.out.println("The word " + temp + " occured " + map.get(temp)	 +" in the sentence");
				}
			}
	}
	
	//To get duplicate occurance of the characters
	static void getDuplicateCharacters(String input) {
		
		HashMap<Character, Integer> charMap = new HashMap<>();
		
		char[] tempArr = input.toCharArray();
		
		for(char temp : tempArr) {
			
//			System.out.println(temp);
			
			if(charMap.get(temp)!=null) {
				
				charMap.put(temp, charMap.get(temp)+ 1);
			}
			else {
				charMap.put(temp, 1);
			}
		}
		
		System.out.println(charMap);
		
		Iterator<Character> TempChar = charMap.keySet().iterator();
		
		while(TempChar.hasNext()) {
			
			char character = TempChar.next();
			
			if(charMap.get(character) > 1) {
				
				System.out.println("The character = " + character + " occured " + charMap.get(character) + "times");
			}
		}
	}
	
	
}
