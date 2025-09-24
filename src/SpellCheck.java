import java.util.ArrayList;

/**
 * Spell Check
 * A puzzle written by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: David Lutch
 * */

public class SpellCheck {


    /**
     * checkWords finds all words in text that are not present in dictionary
     *
     * @param text The list of all words in the text.
     * @param dictionary The list of all accepted words.
     * @return String[] of all mispelled words in the order they appear in text. No duplicates.
     */
    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> misspelledWords = new ArrayList<String>();
        String currentWord = "";

        for (int i = 0; i < text.length; i++) {

            // Only adds the first occurrence of a misspelled word
            if (!misspelledWords.contains(currentWord)) {
                misspelledWords.add(currentWord);
            }
        }

        // Converts the misspelled words from an array list to a string
        String[] misspelled = new String[misspelledWords.size()];
        for (int i = 0; i < misspelledWords.size(); i++) {
            misspelled[i] = misspelledWords.get(i);
        }
        return misspelled;
    }
}
