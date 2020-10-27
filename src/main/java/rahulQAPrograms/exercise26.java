package rahulQAPrograms;

import java.util.Arrays;

public class exercise26 {

    public static void main(String[] args) {
    int a[] = { 1, 1, 6, 7, 2 };

        System.out.println(Arrays.stream(a).filter(x -> x !=6 && x!=7).reduce(Integer::sum).getAsInt());
}
}
