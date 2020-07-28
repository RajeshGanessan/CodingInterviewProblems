package InterviewPrograms;

public class NearestNumberInArray {


    private static int getClosetNumberOfTarget(int[] dataArray, int target) {
        if (dataArray.length == 0) {
            System.out.println("Empty Array. Terminating program.");
            System.exit(1);
        }
        // Assume 0th element in array is the closest number to target
        int indexOfClosestNumberToTarget = 0;
        // Get the absolute distance of 0th element to target
        int absoluteDistanceOfNumberToTarget = Math.abs(dataArray[indexOfClosestNumberToTarget] - target);
        // If absolute distance is zero, no need to iterate remaining element of array
        // as no other number will be closest to target
        if (absoluteDistanceOfNumberToTarget == 0)
            return indexOfClosestNumberToTarget;
        // Iterate through remaining element
        for (int i = 1; i < dataArray.length; i++) {
            // Get the absolute distance of ith element to target
            int deltaOfCurrentElement = Math.abs(dataArray[i] - target);
            // If absolute distance is zero, no need to iterate remaining element of array
            // as no other number will be closest to target
            if (deltaOfCurrentElement == 0)
                return i;
                // If current absolute distance is smaller than previously assumed number,
                // replace it
            else if (deltaOfCurrentElement < absoluteDistanceOfNumberToTarget) {
                indexOfClosestNumberToTarget = i;
                absoluteDistanceOfNumberToTarget = deltaOfCurrentElement;
            }

        }
        // Once iteration is over and reaches here, current value of
        // indexOfClosestNumberToTarget index will be closest to target
        return indexOfClosestNumberToTarget;
    }

    public static void main(String[] args) {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        int a[] = {6, 2, 4, 9, 1};
//        System.out.println(a[getClosetNumberOfTarget(a, 5)]);
//        System.out.println(a[getClosetNumberOfTarget(a,10)]);
        System.out.println(a[getClosetNumberOfTarget(a, 6)]);
//        System.out.println(a[getClosetNumberOfTarget(a, 8)]);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
//        int b[] = {11, -2, 4, 15, 96, 6, 87, 90, -9};
//        System.out.println(b[getClosetNumberOfTarget(b, 11)]);
//        System.out.println(b[getClosetNumberOfTarget(b, 95)]);
//        System.out.println(b[getClosetNumberOfTarget(b, 89)]);
//        System.out.println(b[getClosetNumberOfTarget(b, 88)]);
//        System.out.println(b[getClosetNumberOfTarget(b, -7)]);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
//        int c[] = {100};
//        System.out.println(c[getClosetNumberOfTarget(c, 101)]);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
//        int d[] = {6, 2, 4, 9, 1};
//        System.out.println(d[getClosetNumberOfTarget(d, 3)]);
//        System.out.println(d[getClosetNumberOfTarget(d, 5)]);
//        System.out.println(d[getClosetNumberOfTarget(d, -1)]);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
//        int e[] = {-1, 2, 11, 76, 2};
//        System.out.println(e[getClosetNumberOfTarget(e, 5)]);
//        System.out.println(e[getClosetNumberOfTarget(e, 3)]);
//        System.out.println(e[getClosetNumberOfTarget(e, 1)]);
//        System.out.println(e[getClosetNumberOfTarget(e, 0)]);
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
    }
}