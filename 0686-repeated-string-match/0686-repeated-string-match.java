class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n = a.length();
        int m = b.length();
        boolean[] bucket = new boolean[26];
        for (char c : a.toCharArray()) bucket[c - 'a'] = true;
        for (char c : b.toCharArray()) 
            if (!bucket[c - 'a']) return -1;
        StringBuilder sb = new StringBuilder();
        int factor = m/n + (m%n>0? 1:0);
        for(int i=0; i<factor; i++){
            sb.append(a);
        }
        if(sb.indexOf(b)>=0) return factor;
        sb.append(a);
        if(sb.indexOf(b)>=0) return factor+1;
        return -1;
    }
}