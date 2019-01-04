import java.util.HashMap;

public class Trie {
    public TrieNode root;

    public Trie() {
        this.root = new TrieNode(null);
    }
    public boolean contains(String word){
        TrieNode t = searchNode(word);

        if(t != null && t.isWord())
            return true;
        else
        return false;
    }
    public TrieNode searchNode(String str){
        HashMap<Character, TrieNode> children = root.getChildren();
        TrieNode t = null;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.getChildren();
            }else{
                return null;
            }
        }

        return t;
    }
    public boolean insertKey(String word){
        HashMap<Character, TrieNode> children = root.getChildren();

        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);

            TrieNode t;
            if(children.containsKey(c)){
                t = children.get(c);
            }else{
                t = new TrieNode(root);
                children.put(c, t);
            }

            children = t.getChildren();

            //set leaf node
            if(i==word.length()-1)
                t.setWord(true);
        }
        return false;
    }
    public void autocomplete(){

    }
}
