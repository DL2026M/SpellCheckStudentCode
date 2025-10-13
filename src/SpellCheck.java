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

    public String[] checkWords(String[] text, String[] dictionary) {
        ArrayList<String> misspelledWords = new ArrayList<String>();
        String currentWord = "";

        //Trie dictionaryWords = new Trie();
        //Trie misspelled = new Trie();
        TST dictionaryWords = new TST();
        TST misspelled = new TST();

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
