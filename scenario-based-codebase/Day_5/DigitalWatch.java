/*
16. Digital Watch Simulation
Simulate a 24-hour watch:
- Print hours and minutes in a nested for-loop.
- Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements
*/

public class DigitalWatch {

	public static void main (String[] args) {


		for (int hour = 0; hour < 24; hour++) {
			for (int minute = 0; minute < 60; minute++) {
				
				// Display
				String time = String.format("%02d:%02d", hour, minute);
				System.out.println(time);

				// Break when reached 13:00
				if (hour == 13 && minute == 0) {
					System.out.print("Power cut! Clock stopped ar 13:00");
					break;
				}
			}

			// Breaks outerloop
			if (hour == 13) {
				break;
			}


		}

	}
}