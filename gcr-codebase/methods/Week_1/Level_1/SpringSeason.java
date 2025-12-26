import java.util.Scanner;

public class SpringSeason {
	
	// Method to determine spring season
	public boolean isSpringSeason(int m, int d) {
		if(m == 3 && d >= 20 || m == 4 || m == 5 || m == 6 && d <=20) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {

		// Object
		SpringSeason springSeason = new SpringSeason();

		// Take user input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter month: ");
		int month = input.nextInt();
		System.out.print("Enter day: ");
		int day = input.nextInt();


		boolean isSpring = springSeason.isSpringSeason(month, day);


		// Display output
		if(isSpring) {
			System.out.print("It's a Spring Season");
		} else {
			System.out.print("Not a Spring Season");
		}

		input.close();

	}
}