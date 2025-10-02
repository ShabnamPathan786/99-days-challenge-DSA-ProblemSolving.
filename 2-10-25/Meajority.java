class Meajority
 {
    public static int majorityElement(int[] nums) {
        
        // if(nums.length==1){
        //     return nums[0];
        // }
        // for(int i=0;i<nums.length;i++){
        //     int num=nums[i];
        //     int count=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(num==nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count>nums.length/2){
        //        return nums[i];
        //     }

        
       
        // }
        //  return -1;

        //moores voting algorithm always return majority elments 

        int count=0;
        int candidate=0;
        for(int num:nums){
            if(count==0)
            {candidate=num;}
             if(num==candidate){
            count++;
        }else{
            count --;
        }
        }
       
        return candidate;
        
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,3,3,4,5,6,6,6,6};
        int ans=majorityElement(arr);
        System.out.println(ans);
    }
}