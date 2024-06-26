class Solution {
    public int trap(int[] height) {
       // int l=0,r=height.length-1,leftMax=height[l],rightMax=height[r];
       //  int res=0;
       //  while(l<r){
       //      if(leftMax<rightMax){
       //          l++;
       //          leftMax=Math.max(leftMax,height[l]);
       //          res+=leftMax-height[l];
       //      }else{
       //          r--;
       //          rightMax=Math.max(rightMax,height[r]);
       //          res+=rightMax-height[r];
       //      }
       //  }
       //  return res;
        
        int l=0,r=height.length-1,lMax=height[l],rMax=height[r];
        int res=0;
        while(l<r){
            if(lMax<rMax){
                l++;
                lMax=Math.max(lMax,height[l]);
                res+=lMax-height[l];
            }else{
                r--;
                rMax=Math.max(rMax,height[r]);
                res+=rMax-height[r];
            }
        }
        return res;
    }
}