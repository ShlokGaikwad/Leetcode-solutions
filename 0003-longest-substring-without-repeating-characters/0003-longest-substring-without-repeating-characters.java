class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max=0;
        HashSet<Character> hs=new HashSet<>();
        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                max=Math.max(hs.size(),max);
            }else{
                hs.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}