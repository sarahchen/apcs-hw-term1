
public class Shapes {
     public String tri3(int x){
	int indexX = 1;
	int indexY = 1;
	int Count = 1;
	String ans = "";
	while (indexY <= x){
	    int space = x - Count;
	    while (space > 0){
		ans = ans + " ";
		space = space - 1;
	    }
	    while (indexX > 0){
		ans = ans + "*";
		indexX = indexX - 1;
	    }
	    indexY = indexY + 1;
	    Count = indexY;
	    indexX = (indexY * 2) - 1;
	    ans = ans + "\n";
	}
	return ans;
    }

    public String diamond(int h) {
	String diamond = "";
	int base = h / 2;
	int row = 0;
	while (row < h) {
	    
	    //space
	    int space = Math.abs(base - row);
	    while (space > 0) {
		diamond = diamond + " ";
		space = space - 1;
	    }
	    
	    //star
	    int R = base - Math.abs(base - row) + 1;
	    int star = (R * 2) - 1;
	    while (star > 0) {
		diamond = diamond + "*";
		star = star - 1;
	    }

	    diamond = diamond + "\n";
	    row = row + 1;
	}
	return diamond;
    }

}
