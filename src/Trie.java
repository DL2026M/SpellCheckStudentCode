public class Trie {
    // Instance variable
    private final Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word) {
        char firstLetter;
        Node[] next;
        Node currentNode = root;
        // Traverses the trie and creates a node for each character in the word if that node doesn't currently exist
        for (int i = 0; i < word.length(); i++) {
            firstLetter = word.charAt(i);
            next = currentNode.getNext();
            if (next[firstLetter] == null) {
                next[firstLetter] = new Node();
            }
            currentNode = next[firstLetter];
        }
        // Getting the last letter of the string
        currentNode.setWord();
    }

    // Checks to see if the word given is a real word in the dictionary
    public boolean lookup(String word) {
        Node currentNode = root;
        int index;
        for (int i = 0; i < word.length(); i++) {
            index = word.charAt(i);
            // Tests to see if a node that is needed in making the word is absent
            if (currentNode.getNext()[index] == null) {
                return false;
            }
            else {
                // Updating current node
                currentNode = currentNode.getNext()[index];
            }
        }
        return currentNode.isWord();
    }

}
