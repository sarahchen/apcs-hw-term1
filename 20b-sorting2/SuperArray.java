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
	if(data.length <= i || data.length <= index + 1) {
	    data = reAdd(0,data.length,1);
	}
        for(int x=index; x > 0; x--) {
	    if(x > i) {
		data[x] = data[x - 1];
	    } else if (x == i) {
		data[x] = s;
		index = index + 1;
	    } 
	}
    }

    public String get(int i) {
	return data[i];
    }

    public void set(int i, String s) {
	data[i] = s;
    }

    public int size() {
	/*	int size = 0;
	for(int i=0;i<data.length;i++) {
	    if() {
		size = size + 1;
	    }
	}
	return size; */
	return index;
    }

    public String remove(int i) {
	String s = data[i];
	data[i] = null;
	return s;
    }

    // Insertion Sort
    /*    public void iSort() {
	for(int x=0;x<data.length;x++) {
	    int i;
	    for(i=index;i>0 && data[x].compareTo(data[i-1]) > 0; i--) {
		data[i] = data[i-1];
	    }
	    data[i] = data[x];
	}
	} */

    public void iSort() {
	int i,j;
	for(i=1;i<data.length;i++) {
	    String tmp = data[i];
	    for(j=i-1; j>=0 && tmp.compareTo(data[j]) < 0; j--) {
		data[j+1] = data[j];
	    }
	    data[j+1] = tmp;
	}
    }

    // Selection Sort
    public void sSort() {
	for(int i=0;i<data.length;i++) {
	    int minimum = i;
	    for(int x=i;x<data.length;x++) {
		if(data[i].compareTo(data[x]) > 0 ) {
		    minimum = x;
		}
	    }
	    String replace = data[i];
	    String small = data[minimum];
	    data[i] = small;
	    data[minimum] = replace;
	}
    }

    // Bubble Sort
    public void bSort() {
	for(int i=0; i<data.length; i++) {
	    for(int j=i;j<data.length;j++) {
		if(data[i].compareTo(data[j]) > 0) {
		    String tmp = data[j];
		    data[j] = data[i];
		    data[i] = tmp;
		}
	    }
	}
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
	s.add(3, "yay");
	s.add(3, "no");
	s.set(5, "hi");

	System.out.println(s);
    }

}
