public class Node {
    // Instance variables
    private boolean isWord;
    private Node[] next;

    public Node() {
        this.isWord = false;
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

