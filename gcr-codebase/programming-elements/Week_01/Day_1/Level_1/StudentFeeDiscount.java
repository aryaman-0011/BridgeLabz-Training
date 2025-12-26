import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take user input for course fee
	System.out.println("Enter course fee:");
        double fee = input.nextDouble();

        // Take user input for discount percentage
	System.out.println("Enter discounted price offered by college:");
        double discountPercent = input.nextDouble();

        // Discount amount
        double discount = (fee * discountPercent) / 100;

        // Final fee after discount
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
