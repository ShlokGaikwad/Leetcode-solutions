class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        var str2Index = 0;
        for (var i = 0; i < str1.length(); i++) {
            var c1 = str1.charAt(i);
            var c2 = str2.charAt(str2Index);
            if (c2 - c1 == 1
                    || c2 - c1 == -25 // 'z' -> 'a' 
                    || c1 == c2
            ) {
                str2Index++;
            }
            if (str2Index == str2.length()) {
                return true;
            }
        }

        return false;
    }
}