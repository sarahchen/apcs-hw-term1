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

    public Object lSearch(Comparable item) {
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
    
    public Object rbSearch(Comparable item) {

    }

    public Object bSearch(Comparable item) {

    }

}
