import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        System.out.println("number " + 1 + " : " + a);
        System.out.println("number " + 2 + " : " + b);
        for (int i = 2; i <= 100; i++) {
            BigInteger next = a.add(b);
            System.out.println("number " + i + " : " + next);
            a = b;
            b = next;
        }
    }
}