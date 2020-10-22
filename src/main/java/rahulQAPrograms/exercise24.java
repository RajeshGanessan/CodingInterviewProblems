package rahulQAPrograms;

import java.util.ArrayList;

public class exercise24 {

    public static void main(String[] args) {

        System.out.println("creating an array with conditions");
        int start = 1;
        int end = 16;

        ArrayList<String> list = new ArrayList<>();
        for(int i=start;i<end;i++){

            if((i%3 == 0) && (i%5==0)){
                list.add("HOP");
            }
            else if(i%3==0){
                list.add("JUMP");
            }
            else if(i%5==0){
                list.add("RUN");
            }
            else {
                list.add(Integer.toString(i));
            }
        }

        System.out.println(list);
    }
}
