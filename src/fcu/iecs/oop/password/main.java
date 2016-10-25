package fcu.iecs.oop.password;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		
		String OP ;
		
		while(true){
		
		PasswordEncorder OPOP = new PasswordEncorder() ;
		System.out.println("Please enter a password :") ;
		Scanner scanner = new Scanner(System.in);
		OP = scanner.nextLine();
		
		OP = OPOP.encode(OP) ;
		System.out.println(OP);
		
		
		if(OP.equals("exit")){
			
			break ;
			
		}
		
		
		}	
		
		
	}


}