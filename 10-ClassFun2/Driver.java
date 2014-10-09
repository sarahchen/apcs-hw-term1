
public class Driver {
    public static void main(String[] args) {
        Basechar c = new Basechar(),c2;
	Warrior w = new Warrior(),w2;
	Mage m = new Mage(),m2;

	/*	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getHealth());

	System.out.println(m.getMana());
	//m2 = new Basechar;
	//c2 = new Mage();
	//System.out.println(c2.getMana());
	*/

	w.setName("Groo");
	m.setName("Mr. Sage");

	w.attack(m);
	m.attack(w);
	w.attack(w);

	System.out.println(w);
    }

}
