import java.util.Scanner;

public class WordsvsCharacters {
public static void main(String[] args) {
	System.out.println("Enter a sentence:");
	
	Scanner s1 = new Scanner(System.in);
	String userInput = s1.nextLine();
	
	String[] values = userInput.split(" ");
	System.out.println("Number of words:" + values.length);
	
	//int numberOfSpaces = values.length - 1;
	
	//int numberOfLetters = userInput.length() - numberOfSpaces;
	
	int startingNumberOfLetters = 0;
	for(int i=0;i<values.length;i++){
		int letters = values[i].length();
		startingNumberOfLetters = letters + startingNumberOfLetters ;
		
	}
	System.out.println("Letters: " + startingNumberOfLetters);
	//System.out.println("Number of letters is: " + numberOfLetters );
}
}
