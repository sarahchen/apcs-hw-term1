import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
	
	Greet g1,g2,g3,g4;
	g1 = new Greet("Hi");
	g2 = new Greet("Hello");
	
	String Sarah = g1.greetPerson("Sarah");
	String Ethan = g2.greetPerson("Ethan");

	System.out.println(Sarah);
	System.out.println(Ethan);
	System.out.println(g1.loudGreeting(Sarah));
	System.out.println(g2.loudGreeting(Ethan));
    }
}
