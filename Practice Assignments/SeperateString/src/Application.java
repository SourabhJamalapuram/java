import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("Enter a full name: ");
		Scanner s1 = new Scanner(System.in);
		String userInput = s1.nextLine();
	
	//String Str = new String("Welcome-to-Tutorialspoint.com");     
    
		String[] values = userInput.split(" ");
		//System.out.println("First name=" + values[0] + "Last name = " + values[1]);
	System.out.printf("First name is: %s Last name is: %s", values[0],values[1]);
	
}
}
