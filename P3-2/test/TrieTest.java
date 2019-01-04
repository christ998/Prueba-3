import org.junit.Test;

public class TrieTest {
    Trie trie;
    @Test
    public void test(){
        trie=new Trie();
        trie.insertKey("hola");
        System.out.println(trie.root.getChildren().get('h'));
    }
}
