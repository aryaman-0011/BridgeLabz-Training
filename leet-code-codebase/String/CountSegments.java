import java.util.Scanner;

public class CountSegments {

    public static int countSegments(String s) {
        if (s == null || s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = countSegments(s);

        System.out.println("Number of segments: " + result);

        sc.close();
    }
}
