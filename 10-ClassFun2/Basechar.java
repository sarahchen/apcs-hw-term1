//super class of Warrior and Mage
public class Basechar {
    private int health = 20;
    private String name;

    public Basechar(){
	setName(n);
    }

    public String toString(){
	return this.getName();
    }

    public void attack(Basechar other) {
	System.out.println(this.getName()+" is attacking "+other.getName());
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public int getHealth() {
	return health;
    }

    public void SetHealth(int i) {
	health = i;
    }

}
