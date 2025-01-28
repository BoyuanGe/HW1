import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter a string (type 'q' to quit): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("exit");
                break;
            }

            if (isPalindrome(input)) {
                System.out.println("string '" + input + "' is a palindrome。");
            } else {
                System.out.println("string '" + input + "' is not a palindrome。");
            }
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase(); // 忽略大小写并去除空格
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}