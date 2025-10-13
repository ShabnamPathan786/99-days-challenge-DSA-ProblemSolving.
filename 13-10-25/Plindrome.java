class Palindrome {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        int[] arr = new int[str.length()];

        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        int s = 0;
        int end = arr.length - 1;

        
        while (s <= end) {
            if (arr[s] == arr[end]) {
                s++;
                end--;
            } else {
                return false;
            }
        }

        return true; 
    }
}
