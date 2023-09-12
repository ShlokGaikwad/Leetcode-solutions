class Solution {
    public String restoreString(String s, int[] arr) {
        StringBuilder sb=new StringBuilder();
        
        char a[]=new char[s.length()];
        
        for(int i=0;i<s.length();i++){
            a[arr[i]]=s.charAt(i);
        }
        sb.append(a);
        return sb.toString();
    }
}