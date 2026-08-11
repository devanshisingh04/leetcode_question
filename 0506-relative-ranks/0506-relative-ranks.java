class Solution {
    public String[] findRelativeRanks(int[] score) {

        int n = score.length;
        String[] ans = new String[n];
        for (int rank = 1; rank <= n; rank++) {

            int max = -1;
            int index = -1;

            for (int i = 0; i < n; i++) {

                if (score[i] > max && ans[i] == null) {
                    max = score[i];
                    index = i;
                }
            }
            if (rank == 1) {
                ans[index] = "Gold Medal";
            }
            else if (rank == 2) {
                ans[index] = "Silver Medal";
            }
            else if (rank == 3) {
                ans[index] = "Bronze Medal";
            }
            else {
                ans[index] = String.valueOf(rank);
            }
        }

        return ans;
    }
}