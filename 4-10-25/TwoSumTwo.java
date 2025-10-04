import java.util.Arrays;

public class TwoSumTwo {
public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
               
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

       
        return new int[0];
    
    }
    public static void main(String[] args){
        int[] arr={2,7,15,19};
        int[] ans=twoSum(arr,9);
       System.out.println(Arrays.toString(ans));
  
     }
}
 

