class Trie {

    static Node genesis = new Node('\0');

    private static void insert(String word) {
        word = word.toLowerCase();
        Node curr = genesis;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null)
                curr.children[c - 'a'] = new Node(c);
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    private static boolean search(String word) {
        word = word.toLowerCase();
        Node curr = genesis;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null)
                return false;
            curr = curr.children[c - 'a'];
        }
        return curr.isWord;
    }

    private static boolean startsWith(String prefix) {
        prefix = prefix.toLowerCase();
        Node curr = genesis;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (curr.children[c - 'a'] == null)
                return false;
            curr = curr.children[c - 'a'];
        }
        return true;
    }

    public static void main(String args[]) {
        insert("Arjis");
        insert("Arpanet");
        insert("Tree");
        insert("Trie");
        insert("Jason");
        insert("Java");
        insert("Jalandhar");
        insert("Kite");
        insert("Kimono");
        insert("Kit");
        insert("Kits");
        insert("Souromi");
        insert("Souhardyo");

        System.out.println("Searched for : Try, Result: " + search("Try"));
        System.out.println("Searched for : Tree, Result: " + search("Tree"));
        System.out.println("Searched for : Kite, Result: " + search("Kite"));

        System.out.println("Starts with : Kite, Result: " + startsWith("Kite"));
        System.out.println("Startws with : Sou, Result: " + startsWith("Sou"));
    }

    static class Node {
        char character;
        boolean isWord;
        Node[] children;

        Node(char character) {
            this.character = character;
            isWord = false;
            children = new Node[26];
        }
    }
}