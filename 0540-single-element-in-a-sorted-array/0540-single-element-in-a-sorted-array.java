class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0;
        int high = nums.length-1;
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
        return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length -2]){
            return nums[nums.length -1];
        }
        while(low<=high){
            int mid = low+(high -low)/2;
            int f =mid;
            int s =mid;
            if(nums[mid]!=nums[mid-1] && nums[mid]!= nums[mid+1]){
                return nums[mid];
            }
            else if(nums[mid]== nums[mid-1]){
                 f = mid -1;
            }else{
                 s = mid+1;
            }
            int lc = f-low;
            int rc = high -s;
            if(lc%2==0){
                low =s+1;
            }else{
                high = f-1;
            }
        }
        return -1;
    }
}