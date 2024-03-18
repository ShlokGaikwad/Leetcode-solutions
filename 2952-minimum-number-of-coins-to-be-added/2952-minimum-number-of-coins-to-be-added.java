class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        long maxReachable = 0;
        int coinadd = 0;

        for(int coin:coins){
            while(coin > maxReachable+1){
                maxReachable += (maxReachable+1);
                coinadd++;
            }
            maxReachable += coin;
        }

        while(maxReachable < target){
            maxReachable += (maxReachable+1);
            coinadd++;
        }
        return coinadd;
    }
}