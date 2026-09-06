class Solution {
    public String interpret(String com) {
        for(int i=0; i< com.length(); i++){
            com = com.replace("(al)", "al");
             com  =  com.replace("()", "o");
        }
        return com;
    }
}