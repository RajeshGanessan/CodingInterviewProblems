package InterviewPrograms;

import java.util.*;

public class wordsOccuranceInString {

    public static void main(String[] args) {
        System.out.println("Words occurance");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Text to find the occurance of words");
        String inputText = sc.nextLine();
       Map<Character,Integer> map =  processInputText(inputText);
       printDuplicateCharacters(map);
       printCharacterWithCount(map);

    }

    //processing the InputText
    private static Map<Character,Integer> processInputText(String inputText){

        Map<Character,Integer> countMap = new HashMap<>();
        inputText = inputText.toLowerCase();
        char[] charArray = inputText.toCharArray();

        for(Character character : charArray){

            if(countMap.containsKey(character)){
                countMap.put(character,countMap.get(character)+1);
            } else {
                countMap.put(character,1);
            }
        }
        return countMap;
    }

    //printing Duplicate Characters in the list
    private static void printDuplicateCharacters(Map<Character,Integer> charCountMap){

        System.out.println("Duplicate characters :: ");
        Set<Character> keys = charCountMap.keySet();

        for (Character character: keys ) {
            if(!(character==' ')){
                if(charCountMap.get(character) > 1){

                    System.out.println("duplicate : " + character);
                }
            }
        }
    }

    //printing whiteSpace
    private static void printCharacterWithCount(Map<Character,Integer> spaceMap){

        System.out.println("Printing WhiteSpace in the String");
        Set<Character> keys = spaceMap.keySet();
        for(Character character:keys){
            if(character==' '){
                System.out.println("Whitespace founded " + spaceMap.get(character));
            } else {
                System.out.println("Character : " + character + " = " + spaceMap.get(character));
            }
        }
    }
}
