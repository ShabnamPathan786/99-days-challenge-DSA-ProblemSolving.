public class RemoveDuplicate {
     public static int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int k=2;
        for(int i=2;i<nums.length;i++){
                if(nums[i]!=nums[k-2]){
                    nums[k]=nums[i];
                    k++;
                }
        }
        return k;
    }  
    public static void main(String[] args){
        int[] arr={0,0,1,1,1,2,2,2,3,4,4,5,5,5,6};
        int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
    
}
