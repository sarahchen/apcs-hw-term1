
public class Driver {
    public static void main(String[] args) {
	stringStuff s = new stringStuff();

	System.out.println("nonStart(Hello, There): "+s.nonStart("Hello","There"));
	System.out.println("makeABBA(Hi, Bye): "+s.makeAbba("Hi","Bye"));
	System.out.println("diff21(19): "+s.diff21(19));

	System.out.println("CLASSWORK!");
	System.out.println("nearHundred(19): "+s.nearHundred(19));
	System.out.println("teaParty(5, 9): "+s.teaParty(5, 9));
	System.out.println("lastDigit(123, 234, 3): "+s.lastDigit(123,234,3));
    }

}
