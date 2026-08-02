class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int elsum = 0;
        int disum = 0;

        for (int i = 0; i < n; i++) {
            elsum += nums[i];

            int a = nums[i];
            while (a > 0) {
                disum += a % 10;
                a = a / 10;
            }
        }

        return Math.abs(elsum - disum);
    }
}