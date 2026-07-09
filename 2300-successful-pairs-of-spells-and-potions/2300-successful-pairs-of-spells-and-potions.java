class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
       
       int[] ans=new int[spells.length];
       Arrays.sort(potions);
        int j=0;
        for(int i:spells){
            int pairs=fun(i,potions,success);
           ans[j++]=pairs;
        }
        return ans;
    }
    static int fun(int i,int[] potions, long success){
        int l=0;
        int r=potions.length-1;
        int ind=-1;
        while(l<=r){
           int mid = l + (r - l) / 2;
           
            if((long)potions[mid]*i>=success){
                ind=mid;
               
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(ind==-1){
            return 0;
        }
        else{
            
            return potions.length-ind;
            
        }

    }
}