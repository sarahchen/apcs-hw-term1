
public class Driver {
    public static void main(String[] args) {
	Greeter g; //Declare g to be a local variable
	/* 1. allocate the memory for the new Greeter instance
	   2. set up the Greeter (java does this)
	   3. Return the memory address (location) for it
	   4. Store the address in g

	   g now stores a reference to the greeter that is,
	   the address of the greeter.
	   The greeter isn't actually stuffed into g.
	*/
	g = new Greeter();
	System.out.println(g);
	
	//call the greet method on instance g
	g.greet();
       
    }
}
