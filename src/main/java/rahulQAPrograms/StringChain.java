package rahulQAPrograms;

public class StringChain {

    public static void main(String[] args) {

        System.out.println("making the String chain");
        String a = "yo";
        String b = "";
        StringBuilder sb = new StringBuilder();

        if(a.length() == 0 || a.equals("")){
            a = "@";
        }
        if(b.length() == 0 || b.equals("")){
            b = "@";
        }

        char aa = a.charAt(0);
        char bb  = b.charAt(b.length()-1);
        sb.append(aa).append(bb).toString();
        System.out.println(sb);
    }
}
