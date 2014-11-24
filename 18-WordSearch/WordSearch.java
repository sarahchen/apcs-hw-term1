import java.io.*;
import java.util.*;

public class WordSearch {
    
    /* ---------- Instance Variables ----------- */
    private char[][] board;
    private Random rng = new Random();

    /* ---------- Constructor ----------- */
    public WordSearch(int r, int c) {
	board = new char[r][c];
	for(int i = 0; i<board.length; i++) {
	    for(int j = 0; j<board[i].length; j++) {
		board[i][j] = '.';
	    }
	}
    }
    public WordSearch() {
	this(30,30);
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

    /* ------------- Add Methods ----------- */
    public void addH(String s, int row, int col) {
	int r = row, c = col;

	if (c+s.length() <= board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		c++;
	    }
	}
    }

    public void addHBackward(String s, int row, int col) {
	int r = row, c = col;

	if(c-s.length() >= 0) {
	    for(int i=s.length()-1;i>=0;i--) {
		board[r][c] = s.charAt(i);
		c++;
	    }
	}
    }

    public void addV(String s, int row, int col) {
	int r = row, c = col;

	if(r+s.length() <= board.length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
	    }
	}
    }
    
    public void addVBackwards(String s, int row, int col) {
	int r = row, c = col;

	if(r-s.length() >= 0) {
	    for(int i=s.length()-1; i>=0;i--) {
		board[r][c] = s.charAt(i);
		r++;
	    }
	}
    }
    
    public void addDUpR(String s, int row, int col) {
	int r = row, c = col;

	if(r+s.length() <= board.length && c+s.length() <=board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
		c++;
	    }
	}
    }

    public void addDUpL(String s, int row, int col) {
	int r = row, c = col;

	if(r+s.length() <= board.length && c-s.length() >= 0) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r++;
		c--;
	    }
	}
    }

    public void addDDownR(String s, int row, int col) {
	int r = row, c = col;

	if(r-s.length() >=0 && c+s.length() <= board[r].length) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r--;
		c++;
	    }
	}
    }

    public void addDDownL(String s, int row, int col) {
	int r = row, c = col;

	if(r-s.length() >= 0 && c-s.length() >= 0) {
	    for(int i=0; i<s.length();i++) {
		board[r][c] = s.charAt(i);
		r--;
		c--;
	    }
	}
    }


    /* ------------ Smaller Add ------------ */
    public boolean addWordHelper(String w, int row, int col, int deltaR, int deltaC) {
        int r = row, c = col;
	
	for(int i=0;i<w.length();i++) {
	    try {
		if(board[r][c]!='.' && board[r][c]!=w.charAt(i)) {
		    return false;
		}
	    } catch(Exception e) {
		return false;
	    }
	    r = r + deltaR;
	    c = c + deltaC;
	}

	r = row;
	c = col;
	
	for(int i=0; i<w.length(); i++) {
	    board[r][c] = w.charAt(i);
	    r = r + deltaR;
	    c = c + deltaC;
	}
	return true;
    }

    public boolean addWord(String w) {
	int row = rng.nextInt(board.length);
	int col = rng.nextInt(board[row].length);
	int deltaRow = -1 + rng.nextInt(3);
	int deltaCol = -1 + rng.nextInt(3);
	if (deltaRow == deltaCol && deltaCol == 0) {
	    return false;
	}
	return addWordHelper(w, row, col, deltaRow, deltaCol);
    }

    public void fillIn() {
	int row = board.length;
	int col = board[row].length;
	String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addWord("hello");
	w.addWord("bye");
	System.out.println(w);
    }
}
