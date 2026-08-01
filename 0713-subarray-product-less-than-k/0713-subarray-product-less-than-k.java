class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        /*int count=0;
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
        return count;*/
        // optimal
              if (k <= 1) return 0;
        int left=0,pr=1,count=0;
        for(int i=0;i<nums.length;i++){
            pr*=nums[i];
            while(pr>=k){
                pr/=nums[left];
                left++;
            }
            count+=i-left+1;
        }
        return count;
        
    }
}