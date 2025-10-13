public class TSTNode {
    // Instance variables
    private boolean isWord;
    private char letter;
    private TSTNode LEFT;
    private TSTNode RIGHT;
    private TSTNode MIDDLE;
    private TSTNode[] next;

    public TSTNode(char letter) {
        this.letter = letter;
    }

    // Getters
    public boolean getWord() {
        return isWord;
    }
    public TSTNode[] getNext() {
        return next;
    }
    public TSTNode getLeft() {
        return LEFT;
    }
    public TSTNode getRight() {
        return RIGHT;
    }
    public TSTNode getMiddle() {
        return MIDDLE;
    }
    public char getLetter() {
        return letter;
    }

    // Setters
    public void setWord(boolean word) {
        isWord = word;
    }
    public void setLeft(TSTNode left) {
        LEFT = left;
    }
    public void setRight(TSTNode right) {
        RIGHT = right;
    }
    public void setMiddle(TSTNode middle) {
        MIDDLE = middle;
    }
    public void setLetter(char letter) {
        this.letter = letter;
    }
}

