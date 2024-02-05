class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        
        List<Integer> p1=new ArrayList<>(),
        n1=new ArrayList<>(),
        p2=new ArrayList<>(),
        n2=new ArrayList<>();
        
        for (int num : nums1) {
            if (num<0) {
                n1.add(num);
            } else {
                p1.add(num);
            }
        }
        for (int num : nums2) {
            if (num < 0) {
                n2.add(num);
            } else {
                p2.add(num);
            }
        }

        long left = -(long)1e10, right = (long)1e10;
        while (left < right ){
            long mid = (right + left) >> 1;
            //System.out.println("right: "+right+" mid: "+mid);
            //cur, <=mid
            long cur=0;
            //p1*n2
            for(int i=0, j=0;i<p1.size();i++){
                while(j<n2.size() && (long)p1.get(i)*n2.get(j)<=mid) j++;
                cur+=j;
            }
            //n1*p2
            for(int i=0, j=0;i<n1.size();i++){
                while(j<p2.size() && (long)n1.get(i)*p2.get(j)>mid) j++;
                cur+=(p2.size()-j);
            }
            //p1*p2
            for(int i=0, j=p2.size()-1;i<p1.size();i++){
                while(j>=0 && (long)p1.get(i)*p2.get(j)>mid) j--;
                cur+=(j+1);
            }
            //n1*n2
            for(int i=0, j=n2.size()-1;i<n1.size();i++){
                while(j>=0 && (long)n1.get(i)*n2.get(j)<=mid) j--;
                cur+=n2.size()-j-1;
            }
            if(cur<k) left=mid+1;
            else right=mid;
        }
        return left;
    }
}