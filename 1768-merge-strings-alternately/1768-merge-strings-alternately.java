class Solution {
    public String mergeAlternately(String a, String b) {
        String str="";
        int i=0,j=0;    
        while(i<a.length() && j<b.length()){
            str+=a.charAt(i);
            i++;
            str+=b.charAt(j);
            j++;
        }
        
        while(i<a.length()){
            str+=a.charAt(i);
            i++;
        }
        while(j<b.length()){
            str+=b.charAt(j);
            j++;
        }
        return str;
    }
}