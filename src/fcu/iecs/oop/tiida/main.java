package fcu.iecs.oop.tiida;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		NissanTiida car =new NissanTiida();
		int L;
		System.out.println("Please enter a number:");
		L = scanner.nextInt();
		car.tiida(L);

	}

}
