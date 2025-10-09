public class ProdExceptItself {
    

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        
        int leftProd = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProd;     
            leftProd *= nums[i];      
        }

        
        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            updateArray(result, rightProd, i);  
            rightProd *= nums[i];               
        }

        return result;
    }

    
    public void updateArray(int[] nums, int rightProd, int index) {
        nums[index] *= rightProd;
    }

    
    public static void main(String[] args) {
        ProdExceptItself sol = new ProdExceptItself();
        int[] nums = {1, 2, 3, 4};
        int[] result = sol.productExceptSelf(nums);

        for (int val : result) {
            System.out.print(val + " ");
        }
        // Output: 24 12 8 6
    }
}

