import java.util.*;
import java.io.*;

public class Driver {
    private ArrayList al = new ArrayList<Integer>();
    private Random r = new Random();

    public void rg() {
        for(int i=0;i<r.nextInt(10)+10;i++) {
	    int e = r.nextInt(10)+10;
	    al.add(i, e);
	}
    }

    public ArrayList<Integer> lol() {
	return al;
    }

    public static void main(String[] args) {
        Driver d = new Driver();
	d.rg();
	System.out.println(d.lol());
    }
}
