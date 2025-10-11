class FindPeak {
    public static int findPeakElement(int[] arr) {
        int i=0;
        while( i<arr.length-1 && arr[i]<arr[i+1] ){
          i++;
        }
        return i;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,2,4,1,5,6};
        int ans=findPeakElement(arr);
        System.out.println(ans);
    }
}