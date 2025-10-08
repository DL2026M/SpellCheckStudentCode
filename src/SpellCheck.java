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

        Trie dictionaryWords = new Trie();
        Trie misspelled = new Trie();

        // For each word in the dictionary, insert it into the trie
        for (int i = 0; i < dictionary.length; i++) {
            currentWord = dictionary[i];
            dictionaryWords.insert(currentWord);
        }
        //For each word in text: If not in dictionary Trie and not in misspelled Trie, add to misspelled Trie
        for (int i = 0; i < text.length; i++) {

            currentWord = text[i];
            // Only adds the first occurrence of a misspelled word
            if (!dictionaryWords.lookup(currentWord) && !misspelled.lookup(currentWord)) {
                misspelled.insert(currentWord);
                misspelledWords.add(currentWord);
            }
        }

        // Converts the misspelled words from an array list to a string
        String[] misspelledArr = new String[misspelledWords.size()];
        for (int i = 0; i < misspelledWords.size(); i++) {
            misspelledArr[i] = misspelledWords.get(i);
        }
        return misspelledArr;
    }
}
