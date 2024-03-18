class Trie {
    public Trie[] children;
    public boolean first;
    public boolean second;
    public Trie() {
        this.children = new Trie[10];
    }

    public void insert(int val, boolean first, boolean second) {
        Trie copy = this;
        String v = val + "";
        for (char c : v.toCharArray()) {
            int i = c - '0';
            if (copy.children[i] == null) {
                copy.children[i] = new Trie();
            }
            copy = copy.children[i];
            if (first) copy.first = true;
            if (second) copy.second = true;
        }
    }
}
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie trie = new Trie();
        for (int num : arr1) {
            trie.insert(num, true, false);
        }
        for (int num : arr2) {
            trie.insert(num, false, true);
        }

        trie.first = true;
        trie.second = true;
        return maxSteps(trie);
    }

    public int maxSteps(Trie trie) {
        int steps = 0;
        for (int i = 0;i < 10;i++) {
            if (trie.children[i] != null && trie.children[i].first && trie.children[i].second) {
                steps = Math.max(steps, maxSteps(trie.children[i]) + 1);
            }
        }
        return steps;
    }
}