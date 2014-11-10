import java.util.*;
import java.io.*;

public class sarray {
    
    private int[] data; // should be object
    private int last; // keeps track of last number added
    
    /* ------ Constructor ------ */
    pubic sarray(int i) {
	// start array at a certain size: 10
	data = new int[i];
    }

    /* ------ Methods ------ */
    public void add(int i) {
	// add to end
	for(int x=0;x<data.length;x++) {
	    if(data[x] == 0) {
		break;
	    }
	}
	last = x;
	data[x] = i;
    }
    
    public void add(int index, int i) {
	// add at location index, shift everything else down
	int[] a = new int[data.length - index];
	int index2 = -1;
	for(int x=index+1;x<data.length;x++) {
	    index2 += 1;
	    a[index2] = data[x];
	}
	data[index] = i;
	index2 = -1;
	for(int x=index+1;x<data.length;x++) {
	    index2 += 1;
	    data[x] = a[index2];
	}
    }

    public int get(int index) {
	// get item
	return data[index];
    }

    public void set(int index, int i) {
	// set value at index
	data[index] = i;
    }

    public int size() {
	// return size of array
	int sum = 0;
	int size = 0;
	for(int x=0;x<data.length;x++) {
	    for(int i=x+1; i<data.length;i++) {
		sum = sum + data[i];
	    }
	    if(sum == 0) {
		size = x+1;
		break;
	    }
	}
	return size;
    }

    public void remove(int index) {
	// remove item
	data[index] = 0;
    }

    
}
