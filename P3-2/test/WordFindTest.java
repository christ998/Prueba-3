
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raguileoam
 */
public class WordFindTest {
    WordFind wordFind;
    String[] grid1={"TEST","GOAT","BOAT"};
    String[] wordList1={"GOAT","BOAT","TEST"};

    @Before
    public void setup(){
    wordFind=new WordFind();
    }
    @Test
    public void test(){
        wordFind.findWords(grid1, grid1);
    }
}
