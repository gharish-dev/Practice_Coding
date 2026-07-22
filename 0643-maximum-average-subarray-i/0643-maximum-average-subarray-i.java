class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=Integer.MIN_VALUE;
        int sum=0;
        int left=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i-left+1==k){
               double ans1=(double)sum/k;
               System.out.println(sum);
               ans=Math.max(ans,ans1);
               sum-=nums[left];
               left++;
            }
        }
        return ans;
        
        
    }
}