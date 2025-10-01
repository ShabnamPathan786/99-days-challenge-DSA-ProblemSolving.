class TwoPointer
 {
    public static int removeDuplicates(int[] nums) {
        int k=0;
        int i=1;
       while(i<nums.length){
             if(nums[i]!=nums[k]){
                k++;
                nums[k]=nums[i];
                i++;
             }else{
                i++;
             }
        }
        return ++k;
        
    }

    public static void main(String[] args){
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int ans=removeDuplicates(arr);
        System.out.println(ans);
    }
}