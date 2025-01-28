import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first list (format: [a,b,c]):");
        String firstString = sc.nextLine().trim();
        System.out.print("Please enter the second list (format: [1,2,3]):");
        String secondString = sc.nextLine().trim();

        List<String> list1 = parseList(firstString);
        List<String> list2 = parseList(secondString);
        if (list1 == null || list2 == null) {
            System.out.println("error: Lists are empty or format is incorrect");
            return;
        }
        if (list1.size() != list2.size()) {
            System.out.println("error: The size of lists does not match");
        }
        System.out.println(mergeList(list1,list2));
    }

    private static List<String> parseList(String input) {
        if (!input.startsWith("[") || !input.endsWith("]")) {
            return null;
        }
        input = input.substring(1, input.length() - 1);
        String[] tokens = input.split(",");
        List<String> list = new ArrayList<>();
        for (String token : tokens) {
            list.add(token);
        }
        return list;
    }

    private static List<String> mergeList(List<String> list1, List<String> list2) {
        List<String> mergedList = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            mergedList.add(list1.get(i) + list2.get(i));
        }
        return mergedList;
    }
}