class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int l=1;
        int max=0;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int r=max;
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
           if (fun(mid,piles,h)){
               ans=mid;
               r=mid-1;
           }
           else{
              l=mid+1;
           }
        }
        return ans;
        
    }
    static boolean fun(int speed,int[] piles,int h){
        long totalHours = 0;

        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;

            if (totalHours > h)
                return false;
        }

        return true;
    }
}