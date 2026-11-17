class Solution:
    def maxDepth(self, root: TreeNode | None) -> int:
        return self.fun(root)

    def fun(self, root):
        if root is None:
            return 0

        left = self.fun(root.left)
        right = self.fun(root.right)

        return 1 + max(left, right)