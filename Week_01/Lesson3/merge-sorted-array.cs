public class Solution {
    public void Merge(int[] nums1, int m, int[] nums2, int n) {
        var len1 = m - 1;
        var len2 = n - 1;
        var len = m + n - 1;
        while ((len1 >= 0) && (len2 >= 0))
        {
            nums1[len--] = nums2[len2] > nums1[len1] ? nums2[len2--] : nums1[len1--];
        }
        System.Array.Copy(nums2, 0, nums1, 0, len2 + 1);
    }
}