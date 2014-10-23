public class array {
    public static void main(String[] args) {
	
	//declare an array to hold ints
	int[] intArray;
	//declare an array to hold Strings
	String[] stringArray;

	//HAVE to say how many things in array
	intArray = new int[5];
	stringArray = new String[5];

	//in one line
	int[] intArray2 = new int[10];

	// This is OKAY because from 0-4
	//Set 2nd item to 5
	intArray[2] = 5;
	// 7 is out of range -- only 0-4 (bc int[5])
	//intArray[7] = 20;
	
	stringArray[2] = "hello";

	System.out.println(intArray.length);
	//returns 5
	System.out.println(intArray);
	System.out.println(stringArray);
    }
}
