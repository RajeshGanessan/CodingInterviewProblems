package programs;

public class duplicateCharactersInString {

    public static void main(String[] args) {

        System.out.println("finding duplicate characters in String");
        String input = "JavaIsAProgrammingLanguage";
        int count = 0;
        String validInput = input.toLowerCase();

        char[] chars = validInput.toCharArray();

        System.out.println("Duplicate characters are :: ");
        for(int i = 0;i<validInput.length();i++){

             for(int j=i+1;j<validInput.length();j++){

                if(validInput.charAt(i) == validInput.charAt(j)){

                    System.out.println(chars[j]);
                    count++;
                    break;
                }
         }
        }
    }
}
