#from collections import deque

class Solution:
    def levelOrder(self, root):
        q = deque()
        ans = []

        self.fun(root, q, ans)

        return ans

    def fun(self, root, q, ans):

        if root is not None:
            q.append(root)

        while q:

            n = len(q)
            li = []

            for i in range(n):

                p = q.popleft()

                li.append(p.val)

                if p.left is not None:
                    q.append(p.left)

                if p.right is not None:
                    q.append(p.right)

            ans.append(li)