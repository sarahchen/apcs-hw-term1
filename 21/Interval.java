import java.io.*;
import java.util.*;

public class Interval {

    private int low;
    private int high;
    private Random r = new Random();

    public Interval () {
	low = r.nextInt(100);
	high = low + r.nextInt(100) + 1;
    }
    public Interval (int l, int h) {
	low = l;
	high = h;
    }

    public int getLow() {
	return low;
    }
    
    public int getHigh() {
	return high;
    }

    public int compareTo(Interval other) {
        if(this.getLow() == other.getLow()) {
	    if(this.getHigh() > other.getHigh()) {
		return 1;
	    } else if(this.getHigh() < other.getHigh()) {
		return -1;
	    } else {
		return 0;
	    }
	} else if(this.getLow() < other.getLow()) {
	    return -1;
	} else {
	    return 1;
	}
    }

    public String toString() {
	String output = "{";
	for (int i = low; i < high; i++) {
	    output = output + i + " ";
	}
	output = output + "}";
	return output;
    }

    public static void main(String[] args) {
	Interval[] stuff = new Interval[5];
	for(int i=0;i<stuff.length;i++) {
	    stuff[i] = new Interval();
	}
	for (int j = 0; j < stuff.length; j++) {
	    System.out.println(stuff[j]);
	}
    }
}
