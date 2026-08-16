class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int current = 0;
        double avg = 0;
        for(int i=0; i<k; i++){
            current +=(nums[i]);
        }
        avg = (double)current/k;
        double max = avg;
        for(int i=1; i<=nums.length-k; i++){
            current = current - nums[i-1] + nums[i+k-1];
            avg =(double) current / k; 

             if(avg > max ){
            max = avg;
        }
        }
       
        return max;
    }
}