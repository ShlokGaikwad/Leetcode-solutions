class Solution {
    public String lastNonEmptyString(String s) {
        int[][] countAndLastIndex = new int[26][3]; 
        int maxCount = 0, codePoint = 0;
        for (int i = 0; i < s.length(); i++) {
            codePoint = s.charAt(i) - 'a';
            countAndLastIndex[codePoint][0]++;
            countAndLastIndex[codePoint][1] = i;
            countAndLastIndex[codePoint][2] = codePoint;
            maxCount = Math.max(maxCount, countAndLastIndex[codePoint][0]);
        }
        Arrays.sort(countAndLastIndex, (a,b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        StringBuilder stb = new StringBuilder();
        for (int[] count : countAndLastIndex) {
            if (count[0] == maxCount) {
                stb.append((char)(count[2] + 'a'));
            }
        }
        return stb.toString();
    }
}