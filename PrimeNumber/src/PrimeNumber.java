
public class PrimeNumber {

    public static String isPrimeNumber(int... numbers) {
        String[] temp = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = prime(numbers[i], numbers[i] - 1) == 1 ? "YES" : "NO";
        }
        return String.join("\n", temp);
    }

    public static int prime(int a, int b) {

        return a == 1 || b == 1 ? 1 : a % b == 0 ? 0 : prime(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
    }
}
