
public class sarray {
    
    private int[] data; // should be object
    private int last; // keeps track of last number added
    
    /* ------ Constructor ------ */
    public sarray() {
	data = new int[10];
    }
    
    public sarray(int i) {
	// start array at a certain size: 10
	data = new int[i];
    }

    /* ------ Methods ------ */
    public void findLast() {
	int sum;
	int index;
	for(int i=0;i<data.length;i++) {
	    sum = 0;
	    for(int x=i+1; x<data.length;x++) {
		sum = sum + data[x];
	    }
	    if(sum == 0 && i == 0 && data[i] == 0) {
		last = 0;
		break;
	    } else if (sum == 0 && data[0] != 0) {
		last = i;
		break;
	    }
	}
    }

    public String toString() {
	String s = "";
	for(int i=0;i<data.length;i++) {
	    if (i == data.length -1) { 
		s = s + " " + data[i]; 
	    }
	    else {s = s + " " +  data[i];}
	}
	return s;
    }

    public int[] shift(int start, int end) {
	int[] storage = new int[end - start];
	int index = -1;
	for(int i=start;i<end;i++) {
	    index += 1;
	    storage[index] = data[i];
	}
	return storage;
    }

    public boolean add(int i) {
	findLast();
	if(last == 0) {
	    data[0] = i;
	}
        else if(data.length <= last) {
	    int[] storage = shift(0, last);
	    data = new int[data.length + 1];
	    for(int x=0;x<storage.length;x++){
		data[x] = storage[x];
	    }
	    data[last + 1] = i;
	} 
	else {
	    data[last + 1] = i;
	}
	return true;
    }
    
    public void add(int index, int i) {
	// add at location index, shift everything else down
        int[] storage = shift(index, data.length);
	data[index] = i;
	int index2 = -1;
	for(int x=index+1;x<data.length;x++) {
	    index2 += 1;
	    data[x] = storage[index2];
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
	// return size of list
        int size = 0;
	for(int i=0; i<data.length; i++) {
	    if(data[i] != 0) {
		size += 1;
	    }
	}
	return size;
    }

    public void remove(int index) {
	// remove item
	data[index] = 0;
    }

    /* -------- MAIN --------- */
    public static void main(String[] args) {
	sarray s = new sarray();
	System.out.println(s.toString());
	System.out.println(s.size());
	s.add(5);

	System.out.println("NEW");
	System.out.println(s.toString());
	System.out.println(s.size());

	s.add(6);
	s.add(2, 4);
	s.remove(0);
	System.out.println(s.toString());
	System.out.println(s.size());
	
    }

    
}
