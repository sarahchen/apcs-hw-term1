import java.io.*;
import java.util.*;

public iSearch {
    private Random rng = new Random();
    private Comparable[] array;

    public iSearch() {
	array = new Comparable[10];
    }
    public iSearch(int i) {
	array = new Comparable[i];
    }

    public Comparable lSearch(Comparable item) {
	boolean found = false;
	for(int i=0;i<array.length;i++) {
	    if(array[i].equals(target)) {
		found = true;
		break;
	    }
	}
	if(found) {return array[i];}
	else {return null;}
    }

    public Comparable bSearch(Comparable item) {
	int high = array.length;
	int low = 0;
	while ((high - low) > 0) {
	    int mid = (high + low) / 2;
	    int compare = array[mid];
	    if(compare.equals(item)) {
		return array[mid];
	    } else if (compare > item) {
		high = mid;
	    } else {
		low = mid;
	    }
	}
	return null;
    }

    public Comparable rbSearch(int high, int low, Comparable item) {
	
    }

    public Comparable rbSearch(Comparable item) {
	
    }

}
