import java.util.Scanner;

public class Scannertest {
	
	public static void main(String[] args) {
		String firstname;
		String lastname;
		int alter;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
		firstname = sc.next();

		System.out.println("Bitte geben Sie Ihren Nachnamen ein: ");
		lastname = sc.next();
		
		System.out.println("Bitte geben Sie Ihren Alter ein:");
		alter = sc.nextInt();

		System.out.println("Ihre Daten " + firstname + " " + lastname + " Alter: " + alter);
	}
}



