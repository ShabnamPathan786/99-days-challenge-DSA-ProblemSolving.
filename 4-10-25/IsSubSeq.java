public class IsSubSeq {
    
        public static boolean isSubsequence(String s, String t) {
            int i = 0; // pointer for s
            int j = 0; // pointer for t

            while (i < s.length() && j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;
            }

            return i == s.length();
        }
        public static void main(String[] args){
            System.out.println(isSubsequence("abc","yu"));

        }
    }

    

