class RemoveElement
 {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // index for placing non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k; // new length after removing val
    }
    public static void main(String[] args){
        int[] arr={3,2,2,3};
        int ans=removeElement(arr ,3);
        System.out.println(ans);
    }
}
