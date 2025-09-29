
public class HappyNo {

    public int  isHappy(int n) {
        int sq=0;
        while(n!=0) {
            int rem=n%10;
            sq=sq+(rem*rem);
            n=n/10;
        }
       return sq;
    }

    public static void main(String[] args){
        HappyNo h=new HappyNo();
        System.out.println(h.isHappy(19));
    }
    
}
