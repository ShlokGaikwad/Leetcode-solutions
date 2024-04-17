class Solution {
    public void reverseString(char[] s) {
        int x=0,y=s.length-1;
        while(x<=y){
            char temp=s[x];
            s[x]=s[y];
            s[y]=temp;
            x++;
            y--;
        }
    }
}