public class Trie {
    // Instance variable
    private Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word) {
        char firstLetter;
        Node[] next;
        Node currentNode = root;
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

    public boolean lookup(String word) {
        Node currentNode = root;
        int index;
        for (int i = 0; i < word.length(); i++) {
            index = word.charAt(i);
            if (currentNode.getNext()[index] == null) {
                return false;
            }
            else {
                currentNode = currentNode.getNext()[index];
            }
        }
        return currentNode.isWord();
    }

}
