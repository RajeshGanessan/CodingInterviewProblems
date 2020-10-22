package rahulQAPrograms;

import java.util.Scanner;

public class exercis2ee20 {

    /* "Return the sum of the numbers in the array,
a: Return 0 for an empty array.
b: Number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
Ex1: [1, 2, 2, 1] → 6
Ex2: [1, 1] → 2
Ex3: [1, 2, 2, 1, 13] → 6
Ex4: [1, 5, 13, 5] → 6
Ex5: [1, 5, 13, 13, 5] → 6
Ex6: [13, 2, 5, 8, 13, 4] → 13
Ex7: [1,2,2,1,13,13,5] → 6"*/
    public static void main(String[] args) {

        int[] a = {1,2,3,5,13,4};
        int sum = sum(a);
        System.out.println("Sum of Array is " + sum);
    }

    private static int sum(int[] a){

        int sum = 0;
        for(int i=0;i<a.length;i++){

            if(a[i] == 13 || i>0 && a[i-1] == 13 ){
                continue;
            }else {
                sum = sum + a[i];
            }
        }

        return sum;
    }

}
