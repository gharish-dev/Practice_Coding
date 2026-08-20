class Solution {
    public boolean isPowerOfFour(int n) {
        return fun(n);
    }
    static boolean fun(int n){
        if(n==1){
            return true;
        }
        if(n%4!=0){
            return false;
        }
        if(n==0){
            return false;
        }
        return fun(n/4);
    }
}