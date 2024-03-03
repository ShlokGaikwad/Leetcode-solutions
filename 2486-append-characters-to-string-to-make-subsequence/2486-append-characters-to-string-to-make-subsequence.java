class Solution {
    public int appendCharacters(String s, String t) {
        int tStart = 0;
        int sLen = s.length();
        int tLen = t.length();

        for (int i = 0; i < sLen; i++) {
            if (tStart < tLen && s.charAt(i) == t.charAt(tStart))
                tStart++;
        }

        return tLen - tStart;
    }
}