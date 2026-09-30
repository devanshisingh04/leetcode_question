class Solution {
    public int countSubstrings(String s) {
         int count = 0; 
        for(int i=0; i<s.length(); i++){
            for(int j=i;j<s.length();j++){
                int left =i; 
                int right =j;
                boolean isplaindrom=true;
                while(left<right){
                    if(s.charAt(left)!=s.charAt(right)){
                        isplaindrom=false;
                        break;
                    }
                    left++;
                    right--;
                }
                if(isplaindrom){
                count ++;}
            }
        }
        return count;
    }
}