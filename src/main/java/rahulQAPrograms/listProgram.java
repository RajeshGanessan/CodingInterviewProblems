package rahulQAPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class listProgram {

    public static void main(String[] args) {


        String[] letters = {"A","B","C","D","E","F","G",};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(letters));
        ArrayList<String> originalList = new ArrayList<>();
        originalList.addAll(list);


        list.add("NOW I KNOW MY ABC's");
        list.add(0,"123456");
        System.out.println(list);

        list.subList(4,8).clear();
        System.out.println(list);
        list.remove(0);
        System.out.println("Final string  =  " + list);
        System.out.println("Original String = " + originalList );
        }
}
