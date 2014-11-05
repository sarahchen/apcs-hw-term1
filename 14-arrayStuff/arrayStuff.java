import java.util.*;
import java.io.*;

public class arrayStuff {
    private int[] a;
    private Random r;
    
    public arrayStuff(int n) {
        a = new int[n];
	r = new Random();
	for (int i=0;i<a.length;i++) {
	    a[i] = r.nextInt(21);
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


    // -----------------------Main------------------------ //

    public static void main(String[] args) {
	arrayStuff array = new arrayStuff(10);
	System.out.println("modecount = "+array.mode());
    }
}
