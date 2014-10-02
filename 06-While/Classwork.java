
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

    public String tri1(int n) {
	String ans = "";
	int x = 1;
	while (x <= n) {
	    int y = 1;
	    while (y <= x) {
		ans = ans + "*";
		y = y + 1;
	    }
	    ans = ans + "\n";
	    x = x + 1;
	}
	return ans;
    }

    public String tri2(int n){
	String ans = "";
	int x = 1;
	while (x <= n) {
	    int space = n - x;
	    int i = 0;
	    while ( i < space) {
		ans = ans + " ";
		i = i + 1;
	    }
	    int y = 1;
	    while (y <= x) {
		ans = ans + "*";
		y = y + 1;
	    }
	    ans = ans + "\n";
	    x = x + 1;
	}
	return ans;
    }

}
