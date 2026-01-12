import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindWordsContainingChar {

    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                ans.add(i);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        System.out.print("Enter character to search: ");
        char x = sc.next().charAt(0);

        List<Integer> result = findWordsContaining(words, x);

        System.out.println("Indices of words containing '" + x + "': " + result);

        sc.close();
    }
}
