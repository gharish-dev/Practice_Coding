class Solution:
    def combinationSum3(self, k: int, n: int) -> list[list[int]]:
        sum=0
        ans=[]
        self.fun(1,sum,ans,k,n,[])
        return ans
    def fun(self,ind,sum,ans,k,n,li):
        if sum==n and len(li)==k:
            ans.append(li[:])
            return
        for i in range(ind,10):
            sum+=i
            li.append(i)
            self.fun(i+1,sum,ans,k,n,li)
            ele=li.pop()
            sum-=ele

         
        