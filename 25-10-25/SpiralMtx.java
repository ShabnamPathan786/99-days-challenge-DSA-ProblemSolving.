class SpiralMtx {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0;
        int right=n-1;
        int bottom=m-1;
        int left=0;
        while(left<=right && top<=bottom){
            for(int col=left;col<=right;col++){
                    list.add(matrix[top][col]);
            }
            top++;
            for(int row=top;row<=bottom;row++){
                list.add(matrix[row][right]);
            }
           right--;
           if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }
        
    return list;

    }
}