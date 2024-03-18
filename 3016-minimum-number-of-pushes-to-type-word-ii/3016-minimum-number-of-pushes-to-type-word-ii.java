class Solution {
    public int minimumPushes(String word) {
        int a [] = new int [26];
        for(int i =0;i<word.length();i++){
            a[word.charAt(i)-'a']++;
        }
        Arrays.sort(a);
        int res =0, j =0;
        for(int i=25;i>=0;i--){
            if(j<8){
                res+=(a[i]);
            }
            else {
                res+=(((j/8)+1)*a[i]);
            }
            j++;
        }
        return res;
    }
}