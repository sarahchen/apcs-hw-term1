import java.io.*;
import java.util.*;

public class HundredArray {
    private int[] array;
    private Random rng;
    private final int final_example = 123;

    public HundredArray(int n) {
	array = new int[n];
	for (int i=0;i<array.length; i++) {
	    array[i] = 75+rng.nextInt(76);
	}
    }

    public HundredArray() {
        this(100);
    }
    
    /*
    public String toString() {
	String s = ""+array.length;
	//By making a variable final, you can't change the var after
	//final_example = 321;
	s = s + final_example;
	return s;
    }
    */

    public String toString() {
	String s = "";
	for (int i=0; i<array.length; i++) {
	    s = s + array[i] +", ";
	}
	return s;
    }

    public int find(int value) {
        int i = 0;
	for(i=0;i<array.length;i++) {
	    if(array[i] == value) {
	        break;
	    }
	}
    }

    //  public int maxVal() {
	

    public static void main(String[] args) {
        HundredArray a = new HundredArray(100);
	System.out.println(a.find(100));

	/*
	int[] intArray = new int[100];
	Random number = new Random();

	
	for(int i=0;i<100;i++){
	    intArray[i] = number.nextInt(75) + 75;
	    System.out.println(intArray[i]);
	}
	*/
    }
}
