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

    // MIDDLE LETTER (THE MEDIAN OF THE WORDS IN THE DICTIONARY STARTS WITH L)
    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> misspelledWords = new ArrayList<String>();
        String currentWord = "";
        // Might be bigger if there are any sort of special characters
        Node[] map = new Node['z'];
        Node root = new Node(false, map);
        // Filling the trie using the dictionary
        for (int i = 0; i < dictionary.length; i++) {
            currentWord = dictionary[i];

        }



        for (int i = 0; i < text.length; i++) {

            // Call helper function here)

            // Only adds the first occurrence of a misspelled word
            if (!misspelledWords.contains(currentWord)) {
                misspelledWords.add(currentWord);
            }
        }
        // Helper function that checks to see if the word is valid


        // Converts the misspelled words from an array list to a string
        String[] misspelled = new String[misspelledWords.size()];
        for (int i = 0; i < misspelledWords.size(); i++) {
            misspelled[i] = misspelledWords.get(i);
        }
        return misspelled;
    }
}
