
import java.io.*;
import java.util.*;

public class Driver {

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

    }

}
