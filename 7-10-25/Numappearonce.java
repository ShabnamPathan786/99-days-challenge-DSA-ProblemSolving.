
public class Numappearonce {
 public static void main(String[] args) {
    int[] arr={2,3,3,4,2,4,1,1};
    System.out.println(cal(arr));
 }
 static int cal(int[] arr){
    int unique=0;
        for(int i=0;i<arr.length;i++){
                unique^=arr[i];
        }
        return unique;

 }

    
}
