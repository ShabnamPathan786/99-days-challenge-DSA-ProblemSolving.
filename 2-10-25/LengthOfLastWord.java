public class LengthOfLastWord {
    
    public static  int lengthOfLastWord(String s) {
        int idx=s.length()-1;
        int count=0;
        while (idx >= 0 && s.charAt(idx) == ' ') {
            idx--;
        }

        while(idx >= 0 && s.charAt(idx) != ' '){
            count++;
            idx--;
        }
        return count;
        
    }
    public static void main(String[] args){
        String str=" Hello World  ";
        int ans=lengthOfLastWord(str);
        System.out.println(ans);
    }
}
    
