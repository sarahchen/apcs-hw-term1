	
public class Homework {
    public String frontTimes(String str, int n) {
	if(str.length() >=3) {
	    str = str.substring(0,3);
	}
        String newS = "";
	int i = 0;
        while (i < n) {
	    newS = newS + str;
	    i += 1;
	}
        return newS;
    }

    //3 minutes
    public String stringBits(String str) {
	int i = 0;
	String newS = "";
	while (i < str.length()) {
	    if ( i%2 == 0) {
		newS = newS + str.substring(i,i+1);
	    }
	    i = i + 1;
	}
	return newS;
    }
}
	
