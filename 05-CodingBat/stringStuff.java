
public class stringStuff {
    public String nonStart(String a, String b) {
	a = a.substring(1);
	b = b.substring(1);
  
	return a+b;
    }

    public String makeAbba(String a, String b) {
	return a+b+b+a;
    }

    public int diff21(int n) {
	if(n>21) {
	    return (2 * (n - 21));
	}
	else {
	    return (21 - n);
	}
    }

}
