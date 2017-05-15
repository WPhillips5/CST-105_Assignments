import java.util.Scanner;

public class Exercise2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Subtotal:$");
		double subtotal =sc.nextDouble();
		System.out.print("Enter GratuityPercentage:");
		double gratuitypercentage=sc.nextDouble();
		double gratuity=(gratuitypercentage/100)*subtotal;
		double total=(subtotal+gratuity);
		System.out.println("gratuity amount=$"+gratuity+ "Total=$"+total);

	}

}
