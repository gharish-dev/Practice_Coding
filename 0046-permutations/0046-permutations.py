class Solution:
    def permute(self, nums: list[int]) -> list[list[int]]:
        ans=[]
        n=len(nums)
        vis=[0]*n
        self.fun(0,nums,ans,vis,[])
        return ans
    def fun(self,st,nums,ans,vis,l):
        if len(l)==len(nums):
            ans.append(l[:])
            return 
        for i in range(st,len(nums)):
            if  vis[i]==0:
                vis[i]=1
                l.append(nums[i])
                self.fun(0,nums,ans,vis,l)
                vis[i]=0
                l.pop()
        