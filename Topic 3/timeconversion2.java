import java.util.Scanner;

public class timeconversion2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter time in des format");
		double oldtime = kb.nextDouble();
		int hours = (int) oldtime;
		int minutes = (int) ((oldtime - hours)* 60);
		System.out.println(hours + ":" + minutes);
	}

}
