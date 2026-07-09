/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int ans1=0;
        int l=1;
        int r=n;
        while(l<=r){
             int mid = l + (r - l) / 2;
            boolean ans=isBadVersion(mid);
            if(ans){
                ans1=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans1;
        
    }
}