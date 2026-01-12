import java.util.Scanner;

public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String S) {

        StringBuilder s = new StringBuilder();
        int opened = 0;

        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) {
                s.append(c);
            }
            if (c == ')' && opened-- > 1) {
                s.append(c);
            }
        }

        return s.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String S = sc.nextLine();

        String result = removeOuterParentheses(S);

        System.out.println("Result string: " + result);

        sc.close();
    }
}
