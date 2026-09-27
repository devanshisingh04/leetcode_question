class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int row = arr.length; int col = arr[0].length;
            int low = 0; int high = row*col -1;
            while(low<=high){
                int mid = low+(high - low)/2;
                int rmid= mid/col; int cmid= mid%col;
                if(arr[rmid][cmid]==target){
                    return true;
                }else if(arr[rmid][cmid]>target){
                    high = mid-1;
                }else{
                    low = mid +1;
                }
            }
            return false;
    }
}