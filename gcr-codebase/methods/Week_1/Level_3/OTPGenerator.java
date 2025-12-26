import java.util.Scanner;

class OTPGenerator {

    	// Generate a 6-digit OTP using Math.random()
    	public static int generateOTP() {
        	return (int) (Math.random() * 900000) + 100000;
    	}

    	// Check if all OTPs are unique
    	public static boolean areOTPsUnique(int[] otps) {
        	for (int i = 0; i < otps.length; i++) {
            		for (int j = i + 1; j < otps.length; j++) {
                		if (otps[i] == otps[j]) {
                    			return false;
                		}
            		}
        	}
        	return true;
    	}


	public static void main(String[] args) {

        	int[] otps = new int[10];

        	// Generate OTPs 10 times
        	for (int i = 0; i < otps.length; i++) {
            		otps[i] = generateOTP();
        	}

        	// Display OTPs
        	System.out.println("Generated OTPs:");
        	for (int otp : otps) {
            		System.out.println(otp);
        	}

        	// Check uniqueness
        	boolean unique = areOTPsUnique(otps);
        	System.out.println("Are all OTPs unique? " + unique);
    }
}
