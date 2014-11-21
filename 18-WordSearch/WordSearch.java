import java.io.*;
import java.util.*;

public class WordSearch {
    
    private char[][] board;

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


    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.addDDownL("diagonal", 50, 2);
	System.out.println(w);
	w.addH("hello", 3, 5);
	System.out.println(w);
	w.addHBackward("hello", 4, 6);
	System.out.println(w);
    }

}
