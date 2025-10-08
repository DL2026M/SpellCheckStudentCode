public class Trie {
    // Instance variable
    private Node root;

    public void insert(String word) {
        char firstLetter;
        Node[] next;
        Node currentNode = root;
        for (int i = 0; i < word.length() - 1; i++) {
            firstLetter = word.charAt(i);
            next = currentNode.getNext();
            next[firstLetter] = new Node(false, new Node['z']);
            currentNode = next[firstLetter];
        }
        // Getting the last letter of the string
        firstLetter = word.charAt(word.length() - 1);
        next = currentNode.getNext();
        next[firstLetter] = new Node(true, new Node['z']);
    }
    public boolean lookup(String word) {
        if (word == null || word.length() == 0) {
            return false;
        }
        return true;
    }

}
