class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a = new int[nums.length];
        int p = 0, n = 1;

        for (int x : nums) {
            if (x > 0) {
                a[p] = x;
                p += 2;
            } else {
                a[n] = x;
                n += 2;
            }
        }
        return a;
    }
}