import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        String s = sc.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println("Error: please enter a valid year");
            return;
        }

        try{
            int year = Integer.parseInt(s);
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                System.out.println(year + " is a leap year");
            else System.out.println(year + " is not a leap year");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: please enter a valid year");
        }

    }
}