package NewProject;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name : ");
		System.out.println("Hello "+scanner.next());
		scanner.close();
	}
}
