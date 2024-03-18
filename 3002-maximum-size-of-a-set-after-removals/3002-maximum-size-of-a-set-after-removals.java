class Solution {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> sA = Arrays.stream(nums1).boxed().collect(Collectors.toCollection(HashSet::new));
        Set<Integer> sB = Arrays.stream(nums2).boxed().collect(Collectors.toCollection(HashSet::new));

        int sizeA = nums1.length / 2;
        int sizeB = nums2.length / 2;

        if (sizeA <= sA.size() && sizeB <= sB.size()) {
            sA.addAll(sB);
            return Math.min(sizeA + sizeB, sA.size());
        } else {
            if (sizeA > sA.size()) {
                for (int k : sA) {
                    sB.remove(k);
                }
            }

            if (sizeB > sB.size()) {
                for (int k : sB) {
                    sA.remove(k);
                }
            }
        }

        return Math.min(sA.size(), sizeA) + Math.min(sB.size(), sizeB);
    }
}
