
import java.io.*;
import java.util.*;

public class Greeter {

    public void greet() {
	String s = new String("Hello World!");
	System.out.println(s);
	ungreet();
    }
    
    private void ungreet() {
	System.out.println("I'm out.");
    }
}
// Hello. This is my comment....
