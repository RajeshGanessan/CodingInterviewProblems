package InterviewPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordsCount {

	
	
	public static void main(String[] args) {
		
		
		System.out.println("getting the word count");
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("rajesh");
		list.add("anand");
		list.add("merlin");
		
		for(String name : list) {
			 
			if(name.equals("pavi")) {
				
				System.out.println("Good morning");
			}
			System.out.println(name);
		}
		
//		}}
	}
	private static int wordCount(String str) {
		// TODO Auto-generated method stub
		
		int wordCount = str.split(" ").length;
		
		return wordCount;
	}
}
