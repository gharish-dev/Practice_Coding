class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<arr1.length;i++){
            int ele=arr1[i];
            int c=1;
            for(int j=0;j<arr2.length;j++){
                int diff=Math.abs(ele-arr2[j]);
                if(diff<=d){
                    c=0;
                    break;
                }

            }
            if(c==1){
                count+=1;
            }

        }
        return count;
        
    }
}