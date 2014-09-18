
public class Greeter4 {

    private  String greeting = new String("Hello World!");
    
    public void setGreeting(String s) {
	greeting = s;
    }
    public void greet() {
	//	String greeting = new String("Sup!");
	System.out.println(greeting);
    }
    
    public void ungreet() {
	System.out.println("I'm out.");
    }

}
