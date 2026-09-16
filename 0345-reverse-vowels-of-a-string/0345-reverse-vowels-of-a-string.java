class Solution {
    public String reverseVowels(String s) {

        char[] vowel = new char[s.length()];
        int count = 0;

        // Store all vowels
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U') {

                vowel[count] = c;
                count++;
            }
        }

        // Convert string into character array
        char[] ans = s.toCharArray();

        int j = count - 1;

        // Replace vowels from reverse order
        for (int i = 0; i < ans.length; i++) {

            char c = ans[i];

            if (c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' ||
                c == 'O' || c == 'U') {

                ans[i] = vowel[j];
                j--;
            }
        }

        return new String(ans);
    }
}