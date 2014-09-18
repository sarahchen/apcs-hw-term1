import java.util.*;
import java.io.*;

public class Driver4 {
    public static void main(String[] args) {
	Greeter4 g1 = new Greeter4();
	Greeter4 g2 = new Greeter4();
  
	g1.greet();
	g2.greet();

	System.out.println("AFTER");
	g1.setGreeting(new String("Sup!"));
	
	g1.greet();
	g2.greet();
    }


}
