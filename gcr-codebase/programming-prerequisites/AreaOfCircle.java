import java.util.Scanner;

public class AreaOfCircle{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of circle: ");
		int radius = sc.nextInt();

		double area = 3.14 * radius * radius;

		System.out.println("Area of circle is: " + area);
	}
}