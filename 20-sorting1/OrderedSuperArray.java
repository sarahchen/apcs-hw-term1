import java.io.*;
import java.util.*;

public OrderedSuperArray extends SuperArray{

    public boolean add(String s) {
        if(size() >= super.size()) {
	    super.reAdd(0,data.length,5);
	}
	if(size() == 0) {
	    super.add(s);
	} else if(s.compareTo(get(size() - 1)) > 0) {
	    add(s, size());
	} else {
	    for(int i=0;i<size();i++) {
		if(s.compareTo(get(i)) < 0) {
		    add(s, i);
		    break;
		}
	    }
	}
	return true;
    }

    public String set(String word, int index) {
	
    }
    
}
