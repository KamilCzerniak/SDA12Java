
public class LeastCommonMultiple {

    public static int lcm(int... numbers) {

        int lcm = numbers[0];
        for (int n : numbers) {
            lcm = n * lcm / gcd(n, lcm);
        }
        return lcm;

    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println(lcm(2, 5, 7));
    }
}
