import java.io.*;
import java.util.*;

public iSearch {
    private Random rng = new Random();

    public Object lSearch(Comparable[] array, Object target) {
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
    public Object bSearch(Comparable[] array, Object target) {
	
    }

}
