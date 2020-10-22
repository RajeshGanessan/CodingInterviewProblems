package rahulQAPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class exercise21 {

    //"Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
    //The given n may be 0, in which case just return a length 0 array.
    //Ex1:(4) → [0, 1, 2, 3]
    //Ex2:(1) → [0]
    //Ex3:(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    //Ex4:(0) → [0]"

    public static void main(String[] args) {
        System.out.println("Printing array with size , Enter the array size to print");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(Arrays.toString(getArray(num)));
    }

        private static int[] getArray(int num){


            int[] array = new int[num];

            if (num == 0) {
                array[0] = 0;
                return array;
                } else {
                for(int i=0;i<num;i++){
                    array[i] = i;
                }
                return array;

            }
        }

}
