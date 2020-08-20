package programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesIn2Darray {

    public static void main(String[] args) {

        System.out.println("Finding duplicates In an 2D array");

        int[][] inputArray = {{3, 12, 21, 7}, {14, 5, 25, 12}, {18, 4, 9, 2}};

        Set<Integer> duplicateElements = new HashSet<>();
        Set<Integer> deleteRow = new HashSet<>();
        boolean isDuplicate = true;

        for (int i = 0; i < inputArray.length; i++) {

            for (int j=0;j< inputArray[i].length;j++){
                if(i==0){
                    duplicateElements.add(inputArray[i][j]);
                }
                else {
                    deleteRow.add(inputArray[i][j]);
                }
            }
            if(i!=0){
                duplicateElements.retainAll(deleteRow);
                deleteRow.clear();
            }
            if(duplicateElements.size()==0){
                isDuplicate=false;
                break;
            }
        }

        if(isDuplicate)
            System.out.println("Duplicate elements in the array are " + duplicateElements);
        else
            System.out.println("No duplicates found in the array");
    }
}
