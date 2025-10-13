public class Node {
    // Instance variables
    private boolean isWord;
    private Node[] next;

    public Node() {
        this.isWord = false;
        // Total characters in an extended ASCII is 256
        this.next = new Node[256];
    }
    public boolean isWord() {
        return isWord;
    }
    public void setWord() {
        isWord = true;
    }
    public Node[] getNext() {
        return next;
    }

}

