class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        
        ans[0] = 1;

        for(int i=1; i<length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        // suffix[length-1] = 1;
        int suffix = 1;

        for(int i=length-2; i>=0; i--){
            suffix = suffix * nums[i+1];
            ans[i] = ans[i] * suffix;
        }

        return ans;
    }
}