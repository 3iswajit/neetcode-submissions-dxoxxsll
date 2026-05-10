class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max = Integer.MIN_VALUE;
        while(j<prices.length){
            if(prices[j] > prices[i]){
                max = Math.max(max, prices[j] - prices[i]);
            }
            else{
                i = j;
            }
            j++;
        }
        return max == Integer.MIN_VALUE ? 0 : max ;
    }
}
