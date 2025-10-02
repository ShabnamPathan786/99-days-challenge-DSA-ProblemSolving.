public class MaxProfit {
     public static int maxProfit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;  // Track lowest price
            int maxProfit = 0;                // Track max profit

            for (int price : prices) {
                if (price < minPrice) {
                    minPrice = price;         // Update lowest price
                } else if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice; // Update profit
                }
            }

            return maxProfit;
        }
        public static void main(String[] args){
            int[] arr={7,8,5,4,6,9,0,1,2};
            int ans=maxProfit(arr);
            System.out.println(ans);
        }
    }

