public class IntToRoman {

    public static String intToRoman(int num) {
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];         // subtract the value
                sb.append(symbols[i]);    // add the symbol
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3));     // III
        System.out.println(intToRoman(58));    // LVIII
        System.out.println(intToRoman(1994));  // MCMXCIV
    }
}
