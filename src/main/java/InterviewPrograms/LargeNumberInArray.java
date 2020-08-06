package InterviewPrograms;

public class LargeNumberInArray {

    public static void main(String[] args) {

        System.out.println("largest Number in unsorted Array");

        int[] numbers = {12,45,123,22,54,90,5,12,140};

        int max = 0;
        for(int i = 0;i<numbers.length;i++){

            if(max < numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println("The largest number in array is " + max);
    }
}
