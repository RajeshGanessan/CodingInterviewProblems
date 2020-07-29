package InterviewPrograms;

import java.util.Scanner;

public class uniquecharacter {

	public static void main(String[] args) {

		System.out.println("Finding unique character");

		Scanner sc = new Scanner(System.in);

		String text = sc.nextLine();

		System.out.println("the given string is " + isUnique(text));
	}

	private static boolean isUnique(String text) {

		int length = text.length();
		int count;
		boolean flag = false;
		System.out.println(length);

		for (int i = 0; i < length; i++) {

			count = 0;

			for (int j = i; j <length; j++) {

				if (text.charAt(i) == text.charAt(j)) {

					count++;
				}
			}
			
			if(count>1) {
				
				return false;
			}
		}
		

			return true;
	}
}
