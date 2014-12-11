import java.io.*;
import java.util.*;

public class basechar implements Comparable{
    private int health;
    private  int attack;
    private  int armor;
    private int mana;
    private  String name;
    private int luck;
    private String[] names = {"Bob","Henry","Tom","Sam"};
    private Random rng = new Random();
    
    //Constructors
    public basechar() {
	health = 200;
	attack = 30;
	armor = 10;
	mana = 50;
	name = names[rng.nextInt(4)];
	luck = 0;
    }
    
    //Methods
    public int gethealth(){
	return health;
    }
    
    public int getattack(){
        return this.attack;
    }
    public int getarmor(){
        return this.armor;
    }
    public int getmana(){
        return this.mana;
    }
    public String getname(){
        return this.name;
    }
    
    public void sethealth(int value){
        health = value;
    }
    
    public void setattack(int value){
        attack = value;
    }
    
    public void setarmor(int value){
        armor = value;
    }
    
    public void setmana(int value) {
        mana = value;
    }
    
    public void setname(String value){
        name = value;
    }
    public void setcrit(int value){
        luck = value;
    }
    public int getcrit(){
        return this.luck;
    }
    
    public int compareTo(Object o) {
	basechar other = (basechar)o;
        return this.name.compareTo(other.name);
    }

    public static void main(String[] args) {
	basechar[] people = new basechar[5];
	
	for(int i=0;i<people.length;i++) {
	    people[i] = new basechar();
	}
	
	Arrays.sort(people);
	for(int x=0;x<people.length;x++) {
	    System.out.println(people[x].getname());
	}
	
    }
}
