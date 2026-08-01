class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int pr=1;
            for(int j=i;j<nums.length;j++){
                pr*=nums[j];
                if(pr>=k){
                    break;
                }
                count++;
            }
        }
        return count;
        
    }
}