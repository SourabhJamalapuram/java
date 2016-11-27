import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {
public static void main(String[] args) throws FileNotFoundException {
	
	while(true){
		Menu m1 = new Menu();
		m1.showOptions();
		
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
	}
	
}
}
