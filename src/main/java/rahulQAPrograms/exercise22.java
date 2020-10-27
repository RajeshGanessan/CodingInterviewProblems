package rahulQAPrograms;

public class exercise22 {

    /* "Given an array of integers, return true if the array contains either 3 even or 3 odd values.
The odd or even values must be occurring in a sequence i.e. next to each other.
Ex1:[2, 1, 3, 5] → true
Ex2:[2, 4, 2, 5] → true
Ex3:[5, 7, 9, 1] → true
Ex4:[2, 4, 2, 2] → true
Ex5:[1, 4, 2, 3] → false
Ex6:[2, 1, 2, 5] → false
Ex7:[2, 1, 3, 4, 1, 7, 6] → false
Ex8:[2, 1, 3  , 4, 2, 6, 9] → true"*/
    public static void main(String[] args) {

        System.out.println("fFinding the umber of odd and even");
        int[] nums = {2,1,3,4,1,7,6};
        int isTrue = 0;

        for(int i=0;i<nums.length-2;i++) {
            int isOdd = 0;
            int isEven = 0;

            for (int x = i; x < i + 3; x++) {
                if (nums[x] % 2 == 0) {
                    isEven++;
                } else {
                    isOdd++;
                }
                if (isEven == 3 || isOdd == 3) {
                    isTrue = 1;
                    break;
                }
            }
        }

            if(isTrue==1)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }

