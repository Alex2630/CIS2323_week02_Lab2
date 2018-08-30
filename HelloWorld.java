import java.util.Scanner;
// single line comment
/* and big comment*/
/**
	* Bigger comment
	*
*/
public class HelloWorld {
	
	public static void main(String[] args){
		int myAge= 19;
		char mySex = 'M';
		double myHeight = 6.4;
		String name;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.println("Hello Cis2323!");
		System.out.println( "I am " + myAge + " years old.");  
		System.out.print( "I am " + myHeight + " tall.\n");
		System.out.println( "My sex is " + mySex); 
		System.out.println("Who might you be, wayward traveler?");
		name = inputDevice.nextLine();
		System.out.println("I am " + name + " fair bar keep.");
		
		
	}
	
}