
public class CodingBat {
    public boolean mixStart(String str) {
	if(str.length() >= 3 && str.substring(1,3).equals("ix")) {
	    return true;
	}
	else {
	    return false;
	}
    }

    public String makeOutWord(String out, String word) {
	if(out.length() == 4) {
	    String str = new String(out.substring(0,2)+word+out.substring(2));
	    return str; 
	}
	else {
	    return "";
	}   
    }

    public String firstHalf(String str) {
	int l = str.length();
	if((l%2) == 0) {
	    return str.substring(0,(l/2));
	}
	else {
	    return "";
	}
    }

}
