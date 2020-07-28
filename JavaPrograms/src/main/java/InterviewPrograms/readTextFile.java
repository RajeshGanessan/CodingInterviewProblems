package InterviewPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class readTextFile {

	
	
	public static void main(String[] args) throws IOException {
		
		readTextFile read = new readTextFile();
//		read.usingBufferedReader();
		
		read.usingArrayList();
		
		
	
	}
	
	
	public void usingBufferedReader() throws IOException {
	File file = new File("D:\\My learning worksapce\\my-practice\\eclipse-workspace\\JavaLearning\\src\\InterviewPrograms\\Untitled 1");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		
		while((st= br.readLine())!= null) {
			
			System.out.println(st);

		}
	}
	
	//using array list
	public void usingArrayList() {
		
		System.out.println("Iterating through array list");
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Melon");
		
		//Using For loop
		for(int i=0;i<fruits.size();i++) {
			
			System.out.println(i+ ": " + fruits.get(i));
		}
		
		//Using iterator 
		System.out.println("Using iterator to loop array list");
		Iterator It = fruits.iterator();
		while(It.hasNext()) {
			
			System.out.println(It.next() + " ");
		}
	}
}
