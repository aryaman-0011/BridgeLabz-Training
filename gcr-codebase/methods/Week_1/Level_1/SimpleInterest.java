import java.util.Scanner;

public class SimpleInterest {
	
	public int calculateSI(int p, int r, int t) {
		int simpleInterest = (p * r * t) / 100;
		return simpleInterest;
	}

	public static void main(String[] args) {

		SimpleInterest simpleInterest = new SimpleInterest();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter principal amount: ");
		int p = input.nextInt();
		System.out.print("Enter rate: ");
		int r= input.nextInt();
		System.out.print("Enter time: ");
		int t = input.nextInt();

		int si = simpleInterest.calculateSI(p, r, t);

		System.out.print("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
	}
}


		
	