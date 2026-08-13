class Solution {
    public int[] plusOne(int[] digits) {
    int i =  digits.length -1;
    while(i>=0 &&digits[i]==9){
        digits[i] = 0;
        i--;
    }
    if(i>=0){
        digits[i]++;
        return digits;
    }
    int [] array = new int[digits.length + 1];
    array[0] = 1;
    return array;
    }
}