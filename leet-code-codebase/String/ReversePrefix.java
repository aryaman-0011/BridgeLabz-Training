import java.util.Scanner;

public class ReversePrefix {

    public static String reversePrefix(String s, int k) {

        char[] arr = s.toCharArray();

        for (int i = 0; i < k / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = temp;
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        System.out.print("Enter k value: ");
        int k = sc.nextInt();

        String result = reversePrefix(s, k);
        System.out.println("Result string: " + result);

        sc.close();
    }
}
