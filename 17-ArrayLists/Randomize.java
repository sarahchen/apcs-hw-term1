import java.io.*;
import java.util.*;

// HIDDEN COMPLEXITY

public class Randomize {
    private Random rnd = new Random();

    // Makes new ArrayList<Integer>
    public ArrayList<Integer> shuffle1(ArrayList<Integer> l) {
	ArrayList<Integer> result = new ArrayList<Integer>();
	while(l.size()>0) {
	    int i = rnd.nextInt(l.size());
	    int v = l.remove(i);
	    result.add(v);
	}
	return result;
    }

    // Modifies the same ArrayList<Integer>
    public ArrayList<Integer> shuffle2(ArrayList<Integer> l) {
	for(int len=l.size();len>0;len--) {
	    int i = rnd.nextInt(len);
	    int v = l.remove(i);
	    /* l.remove(i) loops through entire ArrayList
	       Takes a lot of time with larger data sets */
	    l.add(v);
	}
	return l;
    }

    public ArrayList<Integer> shuffle3(ArrayList<Integer> l) {
	for(int len=l.size();len>0;len--) {
	    int i = rnd.nextInt(len);
	    int tmp = l.get(i);
	    l.set(i, 
	}
    }

    public static void main(String[] args) {
	Randomize r = new Randomize();
	ArrayList<Integer> l = new ArrayList<Integer>();
	
	if(args.length < 2) {
	    System.exit(0);
	}

	String choice = args[0];
	int size = Integer.parseInt(args[1]);
	
    }

}
