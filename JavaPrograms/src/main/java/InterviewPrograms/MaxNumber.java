package InterviewPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {


        System.out.println("Finding max values in array");


        List<Integer> ListOfNumbers  = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for(int i = 0;i< num ;i++){

            ListOfNumbers.add(sc.nextInt());
        }

        getMaxNumbers(ListOfNumbers);
    }

    //Finding maximum 2 numbers
    private static void  getMaxNumbers(List<Integer> list){

        //2,1,5,6,3
        int maxOne = 0;
        int maxTwo = 0;
       for(int n : list){

           if(maxOne < n){
               maxTwo  = maxOne;
               maxOne = n;
           } else if(maxTwo < n) {

               maxTwo = n;
           }
       }

        System.out.println("Max number 1 :: " + maxOne);
        System.out.println("Max Number 2 :: " + maxTwo);
    }
}
