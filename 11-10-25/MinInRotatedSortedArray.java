public class MinInRotatedSortedArray {
      public static int find (int[] arr,int s,int e){
        if(arr[s]<=arr[e]){
            return arr[s];
        }
            while(s<=e){
                int mid=s+(e-s)/2;
                
                  if(mid>0 && arr[mid]<arr[mid-1]){
                    return arr[mid];
                  } if(mid<arr.length-1 && arr[mid]>arr[mid+1]){
                    return arr[mid+1];
                  }

                  if(arr[s]<=arr[mid]){
                    s=mid+1;
                  }else{
                    e=mid-1;
                  }
            }
        return -1;    
     }
     
      
    public static int findMin(int[] nums) {
     
        return find(nums,0,nums.length-1);
    }
    public static void main(String[] args){
        int[] arr={4,5,6,7,0,1,2,3};
        int ans=findMin(arr);
        System.out.println(ans);

    }
}

