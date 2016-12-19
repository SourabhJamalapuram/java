import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
public static void main(String[] args) throws IOException {
	
	while(true){
		Menu m1 = new Menu();
		m1.showOptions();
		
		PersonManager pm1 = new PersonManager();
		
		
		Scanner s1 = new Scanner(System.in);
		int optionInput = s1.nextInt();
		
		
		UI u1 = new UI();
		
		if(optionInput == 1){
			u1.viewUsers();
		}
		else if(optionInput == 2){
			u1.findUsers();
		}
		else if(optionInput == 3){
			break;
		}
		else if(optionInput == 4){
			
			System.out.println("Enter a name");
			Scanner s3 = new Scanner(System.in);
			String newName = s3.nextLine();
			
			
			System.out.println("Enter a age");
			Scanner s4 = new Scanner(System.in);
			int newAge = s4.nextInt();
			
			pm1.addPerson(newName, newAge);
			
		}
		
		else if(optionInput == 5){
			pm1.deletePerson();
		}
	}
	
}
}