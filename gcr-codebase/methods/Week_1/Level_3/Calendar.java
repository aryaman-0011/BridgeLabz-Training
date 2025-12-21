import java.util.Scanner;

class Calendar {

    	// Get month name
    	public static String getMonthName(int month) {
        	String[] months = {
            	"", "January", "February", "March", "April",
            	"May", "June", "July", "August",
            	"September", "October", "November", "December"
        	};
        	return months[month];
    	}

    	// Check leap year
    	public static boolean isLeapYear(int year) {
        	return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    	}

    	// Get number of days in month
    	public static int getDaysInMonth(int month, int year) {
        	int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        	if (month == 2 && isLeapYear(year)) {
            		return 29;
        	}
        	return days[month];
    	}

    	// Get first day of the month (Gregorian algorithm)
    	public static int getFirstDay(int month, int year) {
        	int y0 = year - (14 - month) / 12;
        	int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        	int m0 = month + 12 * ((14 - month) / 12) - 2;
        	int d0 = (1 + x + (31 * m0) / 12) % 7;
        	return d0;
    	}


    	public static void main(String[] args) {

        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter month (1-12): ");
        	int month = input.nextInt();
        	System.out.print("Enter year: ");
        	int year = input.nextInt();

        	String monthName = getMonthName(month);
        	int days = getDaysInMonth(month, year);
        	int firstDay = getFirstDay(month, year);

        	// Display header
        	System.out.println();
        	System.out.println("     " + monthName + " " + year);
        	System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        	// 5. First loop: indentation
        	for (int i = 0; i < firstDay; i++) {
            		System.out.print("    ");
        	}

        	// 6. Second loop: print days
        	for (int day = 1; day <= days; day++) {
            		System.out.printf("%3d ", day);

            		if ((day + firstDay) % 7 == 0) {
                		System.out.println();
            		}
        	}
    	}
}
