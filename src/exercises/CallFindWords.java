package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class CallFindWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        words.add("java");
        words.add("string");
        words.add("fives");
        words.add("sixes");
        words.add("wordle");
        System.out.println("Enter a word length: ");
        int letters = input.nextInt();
        System.out.println(FindWords.searchWords(words, letters));
    }
}
