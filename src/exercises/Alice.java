package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String aliceText = new String ("alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she had peeped into the " +
                "book her sister was reading, but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought alice 'without pictures or conversation?'");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your search text:");
        String searchTerm = input.nextLine();
        String allLowerCase = searchTerm.toLowerCase();
        boolean hasSearchTerm = aliceText.contains(allLowerCase);
        if (hasSearchTerm) {
            int index = aliceText.indexOf(searchTerm);
            int length = searchTerm.length();
            System.out.println(searchTerm + " was found at index " + index + " and is " + length + " characters long.");
            String newAliceText = new String(aliceText.replace(searchTerm, ""));
            System.out.println(newAliceText);
        } else {
            System.out.println(searchTerm + " was not found.");
        }
    }
}
