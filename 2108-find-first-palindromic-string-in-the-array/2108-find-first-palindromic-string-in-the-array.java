class Solution {
    public String firstPalindrome(String[] words) {
       for(int k=0; k<words.length;k++){
            String s = words[k];
            int i=0;
            int j= s.length()-1;
            while(i<j){
                if(s.charAt(i)!= s.charAt(j)){
                    break;
                }
                i++;
                j--;
            }
            if(i>=j){
                return s;
            }
       }
       return ""; 
    }
}