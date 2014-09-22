
import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {
	String s = "sarah chen";

	int i = s.indexOf(" ");
	System.out.println("Index: "+i);
	System.out.println("First: "+s.substring(0, i));
	System.out.println("Last: "+s.substring(i));
    }

}
