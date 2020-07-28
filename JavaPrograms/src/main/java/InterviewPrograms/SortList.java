package InterviewPrograms;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        System.out.println("sorting the list");

        List<String> Elements = Arrays.asList("Rajesh","pavi","vimala","dinesh","Ganessan");

        System.out.println("Unsorted List");
        Elements.forEach(s -> System.out.println(s));

        System.out.println("Sorted List");

        Collections.sort(Elements,String.CASE_INSENSITIVE_ORDER);
        Elements.forEach(s -> System.out.println(s));
    }
}
