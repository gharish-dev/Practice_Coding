class Solution:
    def subsets(self, nums: list[int]) -> list[list[int]]:
        l=[]
        ans=[]
        self.fun(0,l,nums,ans)
        return ans

    def fun(self,a,b,nums,ans):
        ans.append(b[:])
        for i in range(a,len(nums)):
            b.append(nums[i])
            self.fun(i+1,b,nums,ans)
            b.pop()
        
        