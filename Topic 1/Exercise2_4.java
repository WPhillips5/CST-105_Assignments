import java.util.Scanner;

public class Exercise2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer for Pounds:" );
        double pound = input.nextInt();
        
        // Convert pounds to kilograms
        double kilogram = ((pound / 0.454));
        System.out.println(kilogram + "Kilograms" );
	}

}
