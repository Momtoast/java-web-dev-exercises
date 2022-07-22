package org.launchcode.java.charactercounts;

import java.util.*;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to count: ");
        String phrase = input.nextLine();
        input.close();

        phrase = phrase.toLowerCase();

        char[] charArray = phrase.toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        int counter;

        char[] nonAlphaArray = {'.', '"', ',', ' ', '-', '\'', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        for (char letter : charArray) {
            if (charCounts.containsKey(letter)) {
                counter = charCounts.get(letter) + 1;
                charCounts.replace(letter, counter);
            } else {
                charCounts.put(letter, 1);
            }
        }

        for (char thing : nonAlphaArray) {
            charCounts.remove(thing);
        }

        for (Character letter : charCounts.keySet()) {
            System.out.println(letter + ": " + charCounts.get(letter));
        }
    }
}
