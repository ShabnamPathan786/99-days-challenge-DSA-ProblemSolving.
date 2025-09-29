public class ValidPalindrome {

   
    public static boolean isPalindrome(String s) {
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder();
        sb.append(clean);
        String original=sb.toString();
        sb.reverse();
        String reversed=sb.toString();
        if(original.equals(reversed)){
            return true;
        }
         return false;
      

        
    }
    public static void main(String[] args){
        String s=" a man , a plan, a canal: Panama ";
        System.out.println(isPalindrome(s));

    }
    
}
    

