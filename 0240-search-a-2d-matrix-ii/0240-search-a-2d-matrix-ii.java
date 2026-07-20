class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            boolean flag=fun(matrix[i],target);
            if(flag){
                return true;
            }
        }
        return false;
        
    }
    static boolean fun(int[] arr,int k){
        int l=0;
        int r=arr.length-1;
        if(arr[l]>k){
            return false;
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[mid]<k){
               l=mid+1;
            }
            else{
                
                 r=mid-1;
            }
        }
        return false;
    }
}