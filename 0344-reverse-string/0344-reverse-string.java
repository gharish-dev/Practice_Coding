class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        fun(0,n-1,s);
    }
    static void fun(int l,int r,char[] s){
        if(l>r){
            return;
        }
         char temp = s[l];
        s[l] = s[r];
        s[r] = temp;

        fun(l+1,r-1,s);
    }
}