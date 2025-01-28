public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++)
        {
            for (int j = i; j <= 12; j++) {
                System.out.printf("%d * %d = %d | ", i, j, i * j);
            }
            System.out.println();
        }



    }
}