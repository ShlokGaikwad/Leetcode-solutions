class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hs=new HashSet<>();
        int i=0,j=0,max=0;
        while(i<s.length()){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i));
                i++;
                max=Math.max(max,hs.size());
            }else{
                hs.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}