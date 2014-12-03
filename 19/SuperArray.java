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

    public String[] reAdd(int start, int end, int expand) {
	String[] hold = new String[(end - start) + expand];
	int x = 0;
	for(int i=start;i<data.length;i++) {
	    hold[x] = data[i];
	    x++;
	}
        return hold;
    }
    
    public boolean add(String s) {
	try {
	    data[index + 1] = s;
	} catch (Exception e) {
	    data = reAdd(0,data.length,10);
	    data[index + 1] = s;
	}
	index = index + 1;
	return true;
    }

    public void add(int i, String s) {
        String[] hold = reAdd(i,data.length,0);
        try {
	    data[i] = s;
	} catch (Exception e) {
	    data = reAdd(0,data.length,5);
	    data[i] = s;
	}
        data = reAdd(0,data.length,1);
	int x = i + 1;
	for(int y=0;y<hold.length;y++) {
	    data[x] = hold[y];
	    x++;
	} 
    }

    public String get(int i) {
	return data[i];
    }

    public void set(int i, String s) {
	data[i] = s;
    }

    public int size() {
	int size = 0;
	for(int i=0;i<data.length;i++) {
	    if(data[i]) {
		size = size + 1;
	    }
	}
	return size;
    }

    public String remove(int i) {
	String s = data[i];
	data[i] = null;
	return s;
    }

    /* -------- MAIN --------- */
    public static void main(String[] args) {
	SuperArray s = new SuperArray(4);
	System.out.println(s);
	s.add("Hello");
	s.add("Goodbye");
	s.add("yay");
	System.out.println(s);
	s.add(2, "meh");
	System.out.println(s);
	s.add(5, "yay");
	s.add(5, "no");
	System.out.println(s);
	System.out.println(s.size());
    }

}
