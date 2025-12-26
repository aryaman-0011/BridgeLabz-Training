public class CourseFeeDiscount {
    public static void main(String[] args) {

        double fee = 125000;

        // Discount percentage by the university
        double discountPercent = 10;

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying discount
        double finalFee = fee - discount;

        System.out.println(
            "The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee
        );
    }
}
