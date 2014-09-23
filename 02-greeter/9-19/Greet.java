
public class Greet {

    private String greeting = new String("Howdy");
    public Greet(String s){
	greeting = s;
    }
    // REGULAR METHODS
    public void setGreeting(String s) {
	greeting = s;
    }


    // Generally, methods don't print, they return.
    public String greet() {
	//	String greeting = new String("Sup!");
	//      System.out.println(greeting);
	return greeting;
    }

    public String greetPerson(String p) {
	String person = new String(greeting+" "+p);
	return person;

    }
    
    public String loudGreet(String s) {
	return s.toUpperCase();
    }

    public void ungreet() {
	//System.out.println("I'm out.");
    }

}
