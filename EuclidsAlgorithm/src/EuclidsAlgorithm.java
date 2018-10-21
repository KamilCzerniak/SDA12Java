import java.util.Scanner;

public class EuclidsAlgorithm {

    public static int gcd(int a, int b) {

        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("number a");
        int a = scanner.nextInt();
        System.out.println("number b");
        int b = scanner.nextInt();
        System.out.println(gcd(a, b));
    }
}
