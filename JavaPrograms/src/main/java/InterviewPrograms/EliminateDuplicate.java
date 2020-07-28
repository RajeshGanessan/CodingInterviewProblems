package InterviewPrograms;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class EliminateDuplicate {

    public static void main(String[] args) {


        System.out.println("Removing Duplicates from the List");

        ArrayList<Integer> numbersList = new ArrayList<>();
        Set<Integer> FinalSet;
        List<Integer> finalList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        System.out.println("Enter " + count + "numbers");
        for(int i=0;i<count;i++){

            numbersList.add(sc.nextInt());
        }

////       FinalSet =  processDuplicatesUsingSet(numbersList);
//
//        System.out.println("List without Duplicates are :");
//        FinalSet.forEach(
//
//                s -> System.out.println(s)
//        );
        finalList = processDuplicates(numbersList);

        System.out.println("FinalList without duplicates");
        finalList.forEach(
                s -> System.out.println(s)
        );



    }

    private static Set<Integer> processDuplicatesUsingSet(ArrayList<Integer> Elements){

        Set<Integer> FinalSet = new TreeSet<>();
            Elements.forEach( s -> FinalSet.add(s) );

            return FinalSet;
    }

    private static List<Integer> processDuplicates(ArrayList<Integer> Elements){

        List<Integer> checkList = new ArrayList<>();

        for(int i=0; i< Elements.size();i++){

            int Digit = Elements.get(i);
            if(!checkList.contains(Digit)){
                checkList.add(Digit);
            }
        }

        return checkList;
    }
}
