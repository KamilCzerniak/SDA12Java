import java.util.ArrayList;
import java.util.List;

public class BanknotesAndCoins {

    public static final int[] NOMINAL_ZLOTY = {200, 100, 50, 20, 10, 5, 2, 1};
    public static final int[] NOMINAL_GROSZ = {50, 10, 2, 1};

    public static String money(int zloty, int grosz) {
        List<String> list = new ArrayList<>();
        for (int nom : NOMINAL_ZLOTY) {
            if (zloty / nom != 0) {
                list.add(zloty / nom + " x " + nom + " zł");
                zloty %= nom;
            }
        }
        list.add(" ");
        for (int nom : NOMINAL_GROSZ) {
            if (grosz / nom != 0) {
                list.add(grosz / nom + " x " + nom + " gr");
                grosz %= nom;
            }
        }
        return String.join("\n", list);
    }

    public static void main(String[] args) {
        System.out.println(money(1765, 54));
    }
}

