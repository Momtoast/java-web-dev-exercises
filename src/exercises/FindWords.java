package exercises;

import java.util.ArrayList;

public class FindWords {
    public static ArrayList<String> searchWords(ArrayList<String> arr, int letters) {
        ArrayList<String> fiveLetterWords = new ArrayList<String>();
        for (String i : arr) {
            if (i.length() == letters) {
                fiveLetterWords.add(i);
            }
        }
        return fiveLetterWords;
    }
}
