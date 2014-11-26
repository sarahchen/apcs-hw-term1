import java.io.*;
import java.util.*;

public class SuperArray {
    
    private String[] data;
    private int index;

    /* --------- Constructor ---------- */
    public SuperArray() {
	data = new String[10];
	index = -1;
    }
    
    public SuperArray(int i) {
	data = new String[i];
	index = -1;
    }

    /* -------- Methods ---------- */
    public String toString() {
	String s = "";
	for(int i=0; i<data.length;i++) {
	    s = s +" "+ data[i];
	}
	return s;
    }

    public void reAdd(int start) {
	String[] hold = new String[index + 10];
	for(int i=start;i<data.length;i++) {
	    hold[i] = data[i];
	}
	data = hold;
    }
    
    public boolean add(String s) {
	try {
	    data[index + 1] = s;
	} catch (Exception e) {
	    reAdd(0);
	    data[index + 1] = s;
	}
	index = index + 1;
	return true;
    }

    public void add(int i, String s) {
	
    }

    /* -------- MAIN --------- */
    public static void main(String[] args) {
	SuperArray s = new SuperArray(4);
	System.out.println(s);
	s.add("Hello");
	s.add("Goodbye");
	s.add("yahoo");
	s.add("asdjfkls");
	s.add("yay");
	s.add("meh");
	System.out.println(s);
    }

}
