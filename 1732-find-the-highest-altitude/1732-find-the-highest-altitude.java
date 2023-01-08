class Solution {
    public int largestAltitude(int[] gain) {
        int high=0,curr=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            high=Math.max(curr,high);
        }
        
        return high;    
    }
}