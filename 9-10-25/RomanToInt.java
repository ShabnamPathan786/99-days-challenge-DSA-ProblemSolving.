public class RomanToInt {

    public static int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = getValue(s.charAt(i));

            // If current value is less than previous, subtract; else add
            if (value < prev) {
                total -= value;
            } else {
                total += value;
            }

            prev = value;
        }

        return total;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));    // 3
        System.out.println(romanToInt("LVIII"));  // 58
        System.out.println(romanToInt("MCMXCIV"));// 1994
    }
}
