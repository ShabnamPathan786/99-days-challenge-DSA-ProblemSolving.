public class NumberOfSetBit {
    
public static int count(int n){
    int count = 0;
        while (n != 0) {
            count += (n & 1); 
            n >>>= 1; 
        }
        return count;
}

public static void main(String[] args){
    int ans=count(10);
    System.out.println(ans);
}
}

