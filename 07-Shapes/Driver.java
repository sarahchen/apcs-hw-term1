
public class Driver {

    public static void main(String[] args) {
        Shapes v = new Shapes();

	System.out.println("Height 4");
	System.out.println(v.tri1(4));

	System.out.println("Height 3");
	System.out.println(v.tri2(3));
	
	System.out.println("tri4");
	System.out.println(v.tri4(4));
	
	Shapes yay = new Shapes();
	
	System.out.println("Triangle 3");
	System.out.print(yay.tri3(3));
	
	System.out.println("Diamond");
	System.out.print(yay.diamond(11));
    }

}
