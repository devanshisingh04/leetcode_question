class Solution {
    public boolean isItPossible(String word1, String word2) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        // Count characters of word1
        for (int i = 0; i < word1.length(); i++) {
            arr1[word1.charAt(i) - 'a']++;
        }

        // Count characters of word2
        for (int i = 0; i < word2.length(); i++) {
            arr2[word2.charAt(i) - 'a']++;
        }

        // Try every possible character from word1
        for (int i = 0; i < 26; i++) {

            if (arr1[i] == 0) {
                continue;
            }

            // Try every possible character from word2
            for (int j = 0; j < 26; j++) {

                if (arr2[j] == 0) {
                    continue;
                }

                // Swap
                arr1[i]--;
                arr2[i]++;

                arr2[j]--;
                arr1[j]++;

                // Check distinct characters
                int count1 = 0;
                int count2 = 0;

                for (int k = 0; k < 26; k++) {
                    if (arr1[k] > 0) {
                        count1++;
                    }

                    if (arr2[k] > 0) {
                        count2++;
                    }
                }

                if (count1 == count2) {
                    return true;
                }

                // Undo the swap
                arr1[i]++;
                arr2[i]--;

                arr2[j]++;
                arr1[j]--;
            }
        }

        return false;
    }
}