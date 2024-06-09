class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length() ) return false;
        if( s.equals("") ) return true;
        int k=0;
        
        for(int i=0;i<t.length();i++){
            if(s.charAt(k)==t.charAt(i)){
                k++;
            }
            if(k==s.length()) return true;
        }
        return false;
    }
}