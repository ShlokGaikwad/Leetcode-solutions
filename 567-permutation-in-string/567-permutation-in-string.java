class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        if(l1==0){
            return true;
        }
        if(l2<l1){
            return false;
        }
        int[] countmap=new int[26];
        for(int i=0;i<l1;i++){
            countmap[s1.charAt(i)-'a']++;
            
            countmap[s2.charAt(i)-'a']--;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(countmap[i]==0){
                count++;
            }
        }
        if(count==26){
            return true;
        }
        for(int i=l1;i<l2;i++){
            int r=s2.charAt(i)-'a';
            countmap[r]--;
            if(countmap[r]==0){
                count++;
            }else if(countmap[r]==-1){
                count--;
            }else if(countmap[r]==-1){
                count--;
            }
            int l=s2.charAt(i-l1)-'a';
            countmap[l]++;
            if(countmap[l]==0){
                count++;
            }else if(countmap[l]==1){
                count--;
            }
            if(count==26){
                return true;
            }
        }
        return false;
    }
}