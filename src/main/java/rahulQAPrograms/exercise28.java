package rahulQAPrograms;

import java.util.Arrays;

public class exercise28 {
    public static void main(String[] args) {
        System.out.println("Checking for 7's in the array");

        int[] a = {1,7,1,7};
        if(Arrays.asList(a).contains(null)){
            System.out.println("Array must not contain empty element");
        }else
        System.out.println(checkSeven(a));
    }

    private static boolean checkSeven(int[] a){
        boolean flag = false;
        for(int i=0;i<a.length-1;i++){
            if((a[i] == 7 && a[i+1]==7) || ((a[i] ==7) && (a[i+2]==7))) {
                flag = true;
            }
        }
        return flag;
    }
}
