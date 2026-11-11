class Solution:
    def combine(self, n: int, k: int) -> list[list[int]]:
        ans=[]
        self.fun(1,[],ans,n,k)
        print(ans)
        return ans

    def fun(self,st,l,ans,n,k):
            if(len(l)==k):
                ans.append(l[:])
                return
            for i in range(st,n+1):
                l.append(i)
                self.fun(i+1,l,ans,n,k)
                l.pop()
        