/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raguileoam
 */
public class WordFind {
    public String[] findWords(String[] grid,String[] wordList){
        Trie trie=new Trie();
        for(int i=0;i<grid.length;i++){
           for(int j=0;j<grid[i].toCharArray().length;j++){
             if(i<grid.length-1){
                 trie.insertKey(String.valueOf(grid[i+1].charAt(j)));
             }
             if(j<grid[i].toCharArray().length-1){
               trie.insertKey(String.valueOf(grid[i].charAt(j+1)));
               
             }
             if(i<grid.length-1 && j<grid[i].toCharArray().length-1){
             trie.insertKey(String.valueOf(grid[i+1].charAt(j+1)));
             }
               System.out.println(trie.root);
               
           } 
        }
        System.out.println(trie.contains("TEST"));

        return null;
    }
    public boolean isWord(){
        return false;
    }
}
