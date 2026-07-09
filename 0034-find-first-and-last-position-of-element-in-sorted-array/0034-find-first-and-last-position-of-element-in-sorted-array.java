class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int firstindex=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                firstindex=mid;
                r=mid-1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if( firstindex==-1){
            return new int[]{-1,-1};
        }
        l=0;
         r=nums.length-1;
        int lastindex=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]==target){
                lastindex=mid;
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }

        return new int[]{firstindex,lastindex};
        
        
        
    }
}