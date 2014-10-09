
//subclass of Basechar
public class Warrior extends Basechar {
    private int healthboost = 5;
    private int health = 12345;

    public Warrior (String n){
	// calls the super class's zero param constructor
	// even if you don't write this, the super constructor will always
	// be called as the first line of a subclass' constructor
	super(n); // calls Basechar 1 param cosntructor
	//	setName(n);
    }
    // CONSTRUCTORS IN INHERITANCE
    /* Basechar: default; Warrior: default; OK
       Basechar: 0 param; Warrior: default; OK
       Basechar: default; Warrior: 1 param; OK
       Basechar: 1 param; Warrior: default; ERROR
       Basechar: 0 param; Warrior: 0 param; OVERRIDE OK
       Basechar: 1 param; Warrior: 1 param; ERROR
    */


    public void attack(Basechar other) {
	System.out.println(this.getName()+" is super attacking "+other.getName());
    }

    public int getHealth() {
	return health+super.getHealth();
    }
}
