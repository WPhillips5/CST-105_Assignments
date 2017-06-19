import java.util.Scanner;

public class Divisable {

	private static Scanner input;

	public static void main(String[] args) {
	input = new Scanner(System.in);
		
		System.out.print("Enter An Number: ");
		int s = input.nextInt();
		
		if (s % 5 == 0 && s % 6 == 0)
			System.out.println(s + "Is divisible by 5 and 6.");
		
		if (s % 5 == 0 || s % 6 == 0)
			System.out.println(s + "Is divisible by 5 or 6.");
		
		if (s % 5 == 0 ^ s % 6 == 0)
			System.out.println(s + "Is divisible by 5 or 6, but not both.");
		

	}

}
