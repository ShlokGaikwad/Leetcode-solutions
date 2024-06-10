class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st=new HashSet<>();
        int i=0,j=0,max=0;
        while(i<s.length()){
            if(!st.contains(s.charAt(i))){
                st.add(s.charAt(i));
                i++;
                max=Math.max(max,st.size());
            }else{
                st.remove(s.charAt(j));
                    j++;
                
            }
        }
        return max;
    }
}