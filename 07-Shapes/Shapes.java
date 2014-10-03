
public class Shapes {

    /*FOR LOOP
      for(initialization, test, change in increment) {
      }
      
      for(i=0;i<h;i+1) {}
    */

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

    public String tri4(int h) {
	String tri = "";
	int ind = 0;
	while (ind < h) {
	    int space = 0;
	    while (space < ind) {
		tri = tri + " ";
		space = space + 1;
	    }
	    int star = h - ind;
	    while (star > 0 ) {
		tri = tri + "*";
		star = star - 1;
	    }
	    tri = tri + "\n";
	    ind = ind + 1;
	}
	return tri;

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
