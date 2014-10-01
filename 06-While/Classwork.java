
public class Classwork {
    public String box(int r, int c) {
	String ans = "";
	while( r > 0) {
	    int x = 0;
	    while (x < c) {
		ans = ans + "*";
		x = x + 1;
	    }
	    ans = ans + "\n";
	    r = r - 1;
	}
	return ans;
    }

}
