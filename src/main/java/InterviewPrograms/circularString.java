package InterviewPrograms;

import java.util.Scanner;

public class circularString {

    public static void main(String[] args) {
        circularString cs =  new circularString();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text for input");
        String inputText = sc.nextLine();
        System.out.println("Enter the index you want ");
        int indexToFind = sc.nextInt();
       cs.getTextFromIndex(inputText,indexToFind);


    }

    private void getTextFromIndex(String inputText,int index){

        String[] strArr = inputText.split(" ");
        if(index >=0 && index <= strArr.length){
            System.out.println("Output :: ");
            for(int i = index;i<strArr.length;i++)
                System.out.print(strArr[i] + " ");

            for(int k=0;k<index;k++)
                System.out.print(strArr[k] + " ");

        } else System.out.println("Sorry, You have entered an invalid index");
    }
}
