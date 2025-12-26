class ZaraBonusCalculator {

    	// Generate salary and years of service
    	public static int[][] generateEmployeeData(int employees) {
        	int[][] data = new int[employees][2];

        	for (int i = 0; i < employees; i++) {
            		data[i][0] = (int) (Math.random() * 90000) + 10000;
            		data[i][1] = (int) (Math.random() * 10) + 1;
        	}
        	return data;
    	}

    	// Calculate new salary and bonus
    	public static double[][] calculateBonus(int[][] employeeData) {
        	double[][] result = new double[employeeData.length][2];

        	for (int i = 0; i < employeeData.length; i++) {
            		int salary = employeeData[i][0];
            		int years = employeeData[i][1];

            		double bonus;
            		if (years > 5) {
                		bonus = salary * 0.05;
            		} else {
                		bonus = salary * 0.02;
            		}

            		result[i][0] = salary + bonus; // new salary
            		result[i][1] = bonus;          // bonus amount
        	}
        	return result;
    	}

    	// Display table and totals (without printf)
	public static void displayReport(int[][] oldData, double[][] newData) {

    		double totalOldSalary = 0;
    		double totalNewSalary = 0;
    		double totalBonus = 0;

    		System.out.println("Emp  OldSalary  Years  Bonus   NewSalary");
    		System.out.println("------------------------------------------");

    		for (int i = 0; i < oldData.length; i++) {

        		int oldSalary = oldData[i][0];
        		int years = oldData[i][1];
        		double bonus = newData[i][1];
        		double newSalary = newData[i][0];

        		totalOldSalary += oldSalary;
       			totalNewSalary += newSalary;
        		totalBonus += bonus;

        		System.out.println((i + 1) + "    " + oldSalary + "     " + years + "     " + bonus + "    " + newSalary);
    		}

    		System.out.println("------------------------------------------");
    		System.out.println("Total Old Salary : " + totalOldSalary);
    		System.out.println("Total Bonus      : " + totalBonus);
    		System.out.println("Total New Salary : " + totalNewSalary);
	}


    	public static void main(String[] args) {

        	int employees = 10;

        	int[][] employeeData = generateEmployeeData(employees);
        	double[][] bonusData = calculateBonus(employeeData);

        	displayReport(employeeData, bonusData);
    	}
}
