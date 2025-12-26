import java.util.Scanner;

public class ZaraBonus {
    	public static void main(String[] args) {

        
		Scanner input = new Scanner(System.in);
		int n = 10;

        	// Arrays to store old salary and years of service
        	double[] salary = new double[n];
        	double[] years = new double[n];

        	// Arrays to store bonus and new salary
        	double[] bonus = new double[n];
        	double[] newSalary = new double[n];

        	double totalBonus = 0;
        	double totalOldSalary = 0;
        	double totalNewSalary = 0;

        	// Take user input
        	for (int i = 0; i < n; i++) {
            		System.out.println("Enter details for Employee:");

            		System.out.print("Enter salary: ");
            		salary[i] = input.nextDouble();

            		System.out.print("Enter years of service: ");
            		years[i] = input.nextDouble();

            		// Validation
            		if (salary[i] <= 0 || years[i] < 0) {
                		System.out.println("Invalid input! Please enter valid salary and service years.");
                		i--;
                		continue;
            		}
        	}

        	// Calculating bonus and new salary
        	for (int i = 0; i < n; i++) {

            		if (years[i] > 5) {
                		bonus[i] = salary[i] * 0.05;
            		} else {
                		bonus[i] = salary[i] * 0.02;
            		}

            		newSalary[i] = salary[i] + bonus[i];

            		totalBonus += bonus[i];
            		totalOldSalary += salary[i];
            		totalNewSalary += newSalary[i];
        	}

        	// Display result
        	System.out.println("Total Old Salary of all employees: " + totalOldSalary);
        	System.out.println("Total Bonus Paid by Zara: " + totalBonus);
        	System.out.println("Total New Salary of all employees: " + totalNewSalary);

        	input.close();
    	}
}
