import java.io.*;
import java.util.*;

public class Interval implements Comparable{

    private int low;
    private int high;
    private static Random r = new Random();
    // static = each class has one
    // not each Interval made
    private static int numIntervals = 0;

    public Interval () {
	low = r.nextInt(100);
	high = low + r.nextInt(100) + 1;
	numIntervals = numIntervals + 1;
    }
    public Interval (int l, int h) {
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    
    /*
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
    */

    public int compareTo(Object o) {
	/* cast o to the appropriate type and store
	   in a local variable for convenince
	*/
	Interval other = (Interval)o;
	
	if(this.low == other.low) {
	    return this.high - other.high;
	} else {
	    return this.low - other.low;
	}
	//	return (this.high - this.low) - (other.high - other.low);
    }

    public String toString() {
        String output = "{"+low+", "+high+"}";
	return output;
    }

    public static void main(String[] args) {
	Interval[] stuff = new Interval[5];
	for(int i=0;i<stuff.length;i++) {
	    stuff[i] = new Interval();
	}
	Arrays.sort(stuff);
	for(int i=0;i<stuff.length;i++) {
	    System.out.println(stuff[i]);
	}
    }

    /*
      Interfaces:
      a specification that lists methdods

      interface Name {
        method1 signiture;
	method2 signiture;
	...
      }
      where method signiture is pub/private return type
      name(Params);
      
      Built-In Java Interface
      interface Comparable {
        public int compareTo(object other);
      }
      
      a class that implements an interface must define all 
      the methods in the interface

      you can only extend one class, but you can implement
      multiple interfaces

      how to use Interfaces. Similarly written to inheritance
      public class Interval implements Comparable { ... }
      
    */
}
