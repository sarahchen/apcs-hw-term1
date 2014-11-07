import java.util.*;
import java.io.*;

public class arrayStuff {
    private int[] a;
    private Random r;
    
    public arrayStuff(int n) {
        a = new int[n];
	r = new Random();
	for (int i=0;i<a.length;i++) {
	    a[i] = r.nextInt(20);
	}
    }
    
    public int find(int n) {
	int ans = -1;
        for(int i=0; i<a.length; i++) {
	    if(a[i] == n) {
		ans = i;
		break;
	    }
	}
	return ans;
    }

    public int maxVal() {
        int ans = -1;
	for (int i=0;i<a.length;i++){
	    ans = Math.max(a[i], ans);
	}
	return ans;
    }

    public int freq(int i) {
	int num = a[i];
	int count = 0;
	for(int x=0;x<a.length;x++) {
	    if(a[x] == num) {
		count = count + 1;
	    }
	}
	return count;
    } 

    public String toString() {
	String s = "";
	for(int i=0;i<a.length;i++) {
	    if (i == a.length -1) { s = s + " " + a[i]; }
	    else {s = s + " " +  a[i];}
	}
	return s;
    }

    // -------------------November 5 --------------------- //

    public int mode() {
        int count = 0;
	int mode = -1;
	for(int i=0;i<a.length;i++) {
	    if(freq(i) > count) {
		count = freq(i);
		mode = i;
	    }
	}
	System.out.println(a[mode]);
	return count;
    }

    // -----------------November 6 ----------------------- //

    public int fastMode() {
	int[] bucket = new int[20];
	int mode = -1;
	int modeIndex = -1;
	for(int i=0;i<a.length;i++) {
	    bucket[a[i]] = bucket[a[i]] + 1;
	    if (bucket[a[i]] > mode) {
		mode = bucket[a[i]];
		modeIndex = a[i];
	    }
	}
	return modeIndex;
    } 

    // -----------------------Main------------------------ //

    public static void main(String[] args) {
	arrayStuff array = new arrayStuff(100);
	System.out.println(array.toString());
      	System.out.println("modecount = "+array.fastMode());
    }
}
