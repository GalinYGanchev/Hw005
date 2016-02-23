import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("First number");
		int a = in.nextInt();
		System.out.println("");
		System.out.println("Second number");
		int b = in.nextInt();
		System.out.println("");

		float c = (float) a / b;
		System.out.print("Result a/b = ");
		System.out.println(c);
	}
}