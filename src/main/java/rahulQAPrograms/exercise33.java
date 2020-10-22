package rahulQAPrograms;

import java.util.Arrays;

public class exercise33 {

    //"Return an array that is ""left shifted"" by one. You may modify and return the given array, or return a new array.
    //Ex1:[6, 2, 5, 3] → [2, 5, 3, 6]
    //Ex2:[9, 8, 7, 6, 5] → [8, 7, 6, 5, 9]
    //Ex3:[1, 2] → [2, 1]
    //Ex4:[1] → [1]"
    public static void main(String[] args) {
        System.out.println("Left shifted Array");

        int[] nums = {6,2,5,3};
        int i;
        int first;
        first = nums[0];
        for( i=0;i<nums.length-1;i++){
            nums[i] = nums[i+1];
        }

        nums[i] = first;


        System.out.println(Arrays.toString(nums));
    }
}
