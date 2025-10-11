import java.util.*;
public class Search2D{
    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        int[] ans=search(arr,3);
        System.out.println(Arrays.toString(ans));

    }
    static int[] search(int[][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<arr.length &&col>=0){
            if(target==arr[row][col]){
                return new int[]{row,col};

            }
            else if(target<arr[row][col])
            col--;
            else
            row++;
            
        }
        return new int[]{-1,-1};
    }
    
               
    
}