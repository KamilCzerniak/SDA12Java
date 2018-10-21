public class LeapYear {

    public static String isLeapYear(int... year) {

        String[] temp = new String[year.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = (year[i] % 4 == 0 && year[i] % 100 != 0) || year[i] % 400 == 0 ? "TAK" : "NIE";
        }
        return String.join("\n", temp);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000, 2005, 2009));
    }
}
