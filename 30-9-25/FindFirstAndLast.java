class FindFirstAndLast {
    public int[] searchRange(int[] nums, int target) {
        int[] arr=Arrays.copyOf(nums,nums.length);
        int[] ans=new int[2];
        
        ans[0]=findposition(arr,target,true);
        ans[1]=findposition(arr,target,false);
        
        return ans;
    }
    public int findposition(int[] arr,int target,boolean isstart){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid])
            end=mid-1;
            else if(target>arr[mid])
            start=mid+1;
            else{
                ans=mid;
                if(isstart)
                end=mid-1;
                else
                start=mid+1;
            }
             
        }
        
        return ans;

    }
}