package programs;

public class SecondHighestNumber {

    public static void main(String[] args) {
        System.out.println("Finding Second Highest Number");

        int[] numbers = {65,3,10,54,12,90,72,4,52,102,102};

        int largest = 0;
        int secondLargest = 0;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > largest){
                secondLargest = largest;
                largest = numbers[i];
            }
            else if(numbers[i] > secondLargest && numbers[i]!=largest){
                secondLargest = numbers[i];
            }
        }

        System.out.println("Largest  in array is " + largest);
        System.out.println("Second largest in array is " + secondLargest);
    }
}
