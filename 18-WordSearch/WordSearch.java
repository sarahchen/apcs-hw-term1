import java.io.*;
import java.util.*;

public class WordSearch {
    
    /* ---------- Instance Variables ----------- */
    private char[][] board;
    private ArrayList<String> words;
    private Random rng;

    /* ---------- Constructor ----------- */
    public WordSearch(int r, int c) {
	rng = new Random();
	words = new ArrayList<String>();

	Scanner sc = null;
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open wordlist");
	    System.exit(0);
	}

	while(sc.hasNext()) {
	    words.add(sc.nextLine());
	}

	board = new char[r][c];
	for(int i = 0; i<board.length; i++) {
	    for(int j = 0; j<board[i].length; j++) {
		board[i][j] = '.';
	    }
	}
    }
    public WordSearch() {
	this(30, 50);
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
	String letters = "abcdefghijklmnopqrstuvwxyz";
	
	for(int r=0; r<board.length;r++) {
	    for(int c=0;c<board[r].length;c++) {
		if(board[r][c] == '.') {
		    board[r][c] = letters.charAt(rng.nextInt(26));
		}
	    }
	}
    }

    /* ------------ Make WordSearch from File ------------ */

    ArrayList<String> wordsInPuzzle = new ArrayList<String>();
    public void buildPuzzle(int numwords) {
	while(numwords > 0) {
	    int wordIndex = rng.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if(addWord(word)) {
		numwords--;
		words.remove(wordIndex);
		wordsInPuzzle.add(word);
	    }
	}
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	w.buildPuzzle(10);
	System.out.println(w);
	w.fillIn();
	System.out.println(w);
    }
}
