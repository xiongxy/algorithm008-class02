class Solution {
    public int nthUglyNumber(int n) {
        int[] a = new int[n];
        a[0] = 1;

        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        for (int i = 1; i < n; i++) {
            a[i] = Math.min(Math.min(a[index1] * 2, a[index2] * 3), a[index3] * 5);
            if (a[i] == a[index1] * 2) {
                index1++;
            }
            if (a[i] == a[index2] * 3) {
                index2++;
            }
            if (a[i] == a[index3] * 5) {
                index3++;
            }
        }
        return a[n - 1];
    }
}