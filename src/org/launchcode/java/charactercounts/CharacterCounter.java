package org.launchcode.java.charactercounts;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to count: ");
        String phrase = input.nextLine();
        input.close();

        char[] charArray = phrase.toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        int counter;

        for (char letter : charArray) {
            if (charCounts.containsKey(letter)) {
                counter = charCounts.get(letter) + 1;
                charCounts.replace(letter, counter);
            } else {
                charCounts.put(letter, 1);
            }
        }

        for (Character letter : charCounts.keySet()) {
            System.out.println(letter + ": " + charCounts.get(letter));
        }
    }
}
