package chapter5.exercises;

import java.util.HashMap;

/**
 * A program that can describe a playing card based on given notations.
 * @author LanXue
 */
public class Card {

    String notation;
    private HashMap<String, String> hashMap = new HashMap<>();

    /**
     * Constructs a new program with given notation.
     * @param input the input notation
     */
    public Card(String input) {
        notation = input;
        hashMap.put("A","Ace");
        hashMap.put("2","Two");
        hashMap.put("3","Three");
        hashMap.put("4","Four");
        hashMap.put("5","Five");
        hashMap.put("6","Six");
        hashMap.put("7","Seven");
        hashMap.put("8","Eight");
        hashMap.put("9","Nine");
        hashMap.put("10","Ten");
        hashMap.put("J","Jack");
        hashMap.put("Q","Queen");
        hashMap.put("K","King");
        hashMap.put("D","Diamonds");
        hashMap.put("H","Hearts");
        hashMap.put("S","Spade");
        hashMap.put("C","Clubs");
    }

    public String getDescription() {
        String key1 = notation.substring(0, 1);
        String key2 = notation.substring(1, 2);
        String description = null;
        if (hashMap.containsKey(key1) && hashMap.containsKey(key2)){
            description = hashMap.get(key1) + " of " + hashMap.get(key2);
        } else {
            description = "Unknown";
        }
        return description;
    }

}
