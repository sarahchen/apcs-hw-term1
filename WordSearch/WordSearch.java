import java.io.*;
import java.util.*;

public class WordSearch {
    
    private char[][] board;

    public WordSearch(int r, int c) {
	board = new char[r][c];
    }
    public WordSearch() {
	this(30,20);
    }

    public String toString() {
	String s = "";
	for (int i=0;i<board.length;i++) {
	    for(int j=0;j<board[i].length;j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println(w.toString());
    }

}
