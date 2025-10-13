public class TST {
    // Instance variable
    private TSTNode root;

    public TST() {
        // Using l because the median word in the dictionary begins with l so half of the words will be to the right and
        // half of the words will be to the left of l
        this.root = new TSTNode('l');
    }

    public void insert(String word) {
        TSTNode current = root;
        int index = 0;
        char myLetter = word.charAt(0);

        while (index < word.length()) {

            char TSTletter = current.getLetter();
            // Checks to see if the ASCII value of the word's character ASCII is greater than the current node's character
            if (TSTletter < myLetter) {
                if (current.getRight() == null) {
                    current.setRight(new TSTNode(myLetter));
                }
                // Move down to the right
                current = current.getRight();
                continue;
            }
            else if (TSTletter > myLetter) {
                if (current.getLeft() == null) {
                    // If the node to the left of the current node doesn't exist, then create a new node containing the
                    // current character in the word
                    current.setLeft(new TSTNode(myLetter));
                }
                current = current.getLeft();
                continue;
            }
            // Current letter equals myLetter variable
            else {
                index++;
                // Checks to see if we are at the end of the word
                if (index == word.length()) {
                    current.setWord(true);
                    return;
                }
                if (current.getMiddle() == null) {
                    current.setMiddle(new TSTNode(word.charAt(index)));
                }
                current = current.getMiddle();
                // Updating myLetter with the next letter in the word
                myLetter = word.charAt(index);
            }
        }
        current.setWord(true);

    }

    public boolean lookup(String word) {
        TSTNode current = root;
        int index = 0;
        char myLetter = word.charAt(0);

        while (index < word.length()) {

            if (current == null) {
                return false;
            }

            char TSTletter = current.getLetter();

            if (myLetter > TSTletter) {
                current = current.getRight();
            }
            else if (myLetter < TSTletter) {
                current = current.getLeft();
            }
            else {
                index++;
                if (word.length() == index) {
                    return current.getWord();
                }
                current = current.getMiddle();
                myLetter = word.charAt(index);
            }
        }
        return false;
    }
}
