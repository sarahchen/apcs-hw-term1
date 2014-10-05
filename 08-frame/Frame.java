
public class Frame {

    //While Loop
    public String frameW(int y, int x) {
	String frame = "";
	int row = 0;
	while(row < y) {
	    int col = 0;
	    if(row==0 || row==(y-1)) {
		while(col < x) {
		    frame = frame + "*";
		    col = col + 1;
		}
	    } else {
		while(col < x) {
		    if(col==0 || col==(x-1)) {
			frame = frame + "*";
		    } else {
			frame = frame + " ";
		    }
		    col = col + 1;
		}
	    }
	    frame = frame + "\n";
	    row = row + 1;
	}
	return frame;
    }

    //For Loop
    public String frameF(int y, int x) {
	String frame = "";
	int row;
	for(row=0;row<y;row++) {
	    int col;
	    if(row == 0 || row == y-1) {
		for(col=0;col<x;col++) {
		    frame = frame + "*";
		}
	    } else {
		for(col=0;col<x;col++) {
		    if(col == 0 || col == (x-1)) {
			frame = frame + "*";
		    } else {
			frame = frame + " ";
		    }
		}
	    }
	    frame = frame + "\n";
	}
	return frame;
    }

    //CodingBat Stuff
    public String stringSplosion(String str) {
	String ans = "";
	for(int i=0;i<=str.length();i++) {
	    ans = ans + str.substring(0,i);
	}
	return ans;
    }

    public String stringX(String str) {
	String ans = "";
	for(int i=0;i<str.length();i++) {
	    String letter = str.substring(i,i+1);
	    if(i>0 && i<str.length()-1 && letter.equals("x")) {
		ans = ans;
	    } else {
		ans = ans + letter;
	    }
	}
	return ans;
    }

}
