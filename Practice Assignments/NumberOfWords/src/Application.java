import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) throws IOException {	
		
		System.out.println("Enter a word to search for: ");
		Scanner s1 = new Scanner(System.in);
		String userWord = s1.nextLine();
			
		FileReader inputFile = new FileReader("example.txt");
		BufferedReader br = new BufferedReader(inputFile);
			 
		String readLine = "";
			
		int count = 0;
			while((readLine = br.readLine()) != null) {
				String[] words = readLine.split(" ");
					for(String s : words) {
							if(s.equals(userWord)) ;
							
					}
						count++;	
			}
			
			System.out.println(count);
      	
}
}