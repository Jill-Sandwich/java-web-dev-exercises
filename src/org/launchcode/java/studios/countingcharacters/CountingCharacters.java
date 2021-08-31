package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        String inputValue = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = inputValue.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < charactersInString.length; i++){
            //System.out.println(charactersInString[i]);
            if (!characterCount.containsKey(charactersInString[i])){
                characterCount.put(charactersInString[i], 1);
            } else if (characterCount.containsKey(charactersInString[i])){
                characterCount.put(charactersInString[i], characterCount.get(charactersInString[i]) + 1);
            }
        }
        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
        //System.out.println(characterCount);
    }
}
