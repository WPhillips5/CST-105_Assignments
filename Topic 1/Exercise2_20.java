import java.util.Scanner;

public class Exercise2_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter balance:");
		double balance =sc.nextDouble();
		System.out.print("Enter interest rate:");
		double interestrate=sc.nextDouble();
		double interest=(balance *(interestrate / 1200));
		
		System.out.println("The Interest is"+ " "+ interest);

	}

}
