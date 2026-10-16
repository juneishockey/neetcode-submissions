class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if (nums1.length > nums2.length) {return findMedianSortedArrays(nums2, nums1);}

        int m = nums1.length;
        int n = nums2.length; 
        int half = (m + n + 1) / 2;

        int low = 0; 
        int high = m; 
        while (low <= high){
            int i = (low + high) / 2; // cut at a
            int j = half - i;           // cut at b

            int aLeft = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int aRight = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int bLeft = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int bRight = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (aLeft <= bRight && bLeft <= aRight){
                if ((m+n) % 2 == 1){
                    return Math.max(aLeft, bLeft);
                }
                return (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0;

            } else if (aLeft > bRight) {
                high = i - 1; 
            } else {
                low = i + 1; 
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted");


    }
}
