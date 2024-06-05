class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char[] chars = s.toCharArray();
        while (l < r) {
            char a = chars[l], b = chars[r];
            if (isVowel(a) && isVowel(b)) {
                // Swap the vowels
                char temp = chars[l];
                chars[l] = chars[r];
                chars[r] = temp;
                l++;
                r--;
            } else if (isVowel(a)) {
                r--;
            } else if (isVowel(b)) {
                l++;
            } else {
                l++;
                r--;
            }
        }
        return new String(chars);
    }
    
    public static boolean isVowel(char a){
        char arr[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<arr.length;i++){
            if(a==arr[i]){
                return true;
            }
        }
        return false;
    }
}