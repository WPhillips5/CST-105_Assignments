import java.util.Scanner;

public class Exercise2_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter driving distance:");
           double drivingdistance =sc.nextDouble();
           System.out.print("Enter miles per gallon:");
           double milespergallon=sc.nextDouble();
           System.out.print("Enter price per gallon:");
           double pricepergallon =sc.nextDouble();
           double cost = (drivingdistance / milespergallon)*pricepergallon;
           
           System.out.println("The cost of driving is $"+ cost);
           
	}

}
