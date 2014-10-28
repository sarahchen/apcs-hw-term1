import java.util.*;
import java.io.*;

public class arrayStuff {
    private int[] a;
    private Random r;
    
    public arrayStuff(int n) {
        a = new int[n];
	r = new Random();
	for (int i=0;i<a.length;i++) {
	    a[i] = 75+r.nextInt(76);
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

    public static void main(String[] args) {
	arrayStuff array = new arrayStuff(100);
	System.out.println(array.find(90));
	System.out.println(array.maxVal());
    }

}
