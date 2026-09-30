class Solution {
    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                int left = i;
                int right = j;

                boolean isPal = true;

                while (left < right) {

                    if (s.charAt(left) != s.charAt(right)) {
                        isPal = false;
                        break;
                    }

                    left++;
                    right--;
                }

                if (isPal) {

                    int length = j - i + 1;

                    if (length > ans.length()) {
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }

        return ans;
    }
}