class Solution:
    def combinationSum(self, candidates: list[int], target: int) -> list[list[int]]:
        ans=[]
        self.fun(0,0,[],ans,candidates,target)
        return ans
    def fun(self,ind,sum,li,ans,candidates,target):
       
        if sum==target:
            ans.append(li[:])
            return

        if ind==len(candidates):
            return
        
        if sum+candidates[ind]<=target:
            sum+=candidates[ind]
            li.append(candidates[ind])
            print(sum)
            self.fun(ind,sum,li,ans,candidates,target)
            ele=li.pop()
            sum-=ele
        
        self.fun(ind+1,sum,li,ans,candidates,target)

        
        