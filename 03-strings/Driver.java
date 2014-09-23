
import java.io.*;
import java.util.*;

public class Driver {
<<<<<<< HEAD

    public static void main(String[] args){
	String s="sarah chen";

	System.out.println("Index: ");
	System.out.println(s.indexOf( " " ));
	
	int indexOfs = s.indexOf(" ");
	
	System.out.println("Index: "+indexOfs);

	String f = new String(s.substring(0, indexOfs));
	String l = new String(s.substring(indexOfs));

	System.out.println("First: "+f);
	System.out.println("Last: "+l);

=======
    public static void main(String[] args) {
	String s = "sarah chen";

	int i = s.indexOf(" ");
	System.out.println("Index: "+i);
	System.out.println("First: "+s.substring(0, i));
	System.out.println("Last: "+s.substring(i));
>>>>>>> 6d8241c6011393ac43e9764c51a1d2a4b0f874f6
    }

}
