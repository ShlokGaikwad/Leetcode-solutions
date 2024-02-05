class Solution {
    int start, length, maxLength;
    public String longestPalindrome(String s) {
        start = 0;
        length = 0;
        maxLength = s.length();
        if (maxLength < 2) return s;

        for (int i = 0; i < maxLength -1 ; i ++){
            traversePalindrome(i, i ,s ); // assume that is odd length
            traversePalindrome(i, i + 1 ,s); // assume that is even length
        }
        return s.substring(start, start + length);
    }

    public void traversePalindrome(int left, int right, String s){
        while(left >= 0 && right < maxLength && s.charAt(left) == s.charAt(right)){
            left --;
            right ++;
        }
        if (length < right - left - 1){
            length = right - left - 1;
            start = left + 1;
        }
    }
}