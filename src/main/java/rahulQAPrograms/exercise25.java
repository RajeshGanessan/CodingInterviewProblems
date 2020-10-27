package rahulQAPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercise25 {

    public static void main(String[] args) {
        System.out.println("Differences between largest and smallest");

        Scanner sc =  new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Array = " + Arrays.toString(numbers));
       int diff =  getDifferenceUsingArrays(numbers);
        System.out.println("Diff btw max and min are " + diff);
       int difff =  getdifference(numbers);
        System.out.println("Diff btw max and min are " + difff);

    }

    //Using Arrays method
    private static int getDifferenceUsingArrays(int[] numbers){

        if(numbers.length<=1){
            System.out.println("Enter valid array to get difference");
        }
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
        int min = numbers[0];

        return max - min;
    }

    //Without using Arrays method
    private static int getdifference(int[] numbers){

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i=0;i<numbers.length;i++){
            if(numbers[i] > largest ){
                largest = numbers[i];
            } else if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return  largest - smallest;
        }
}
