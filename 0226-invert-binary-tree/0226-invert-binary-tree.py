class Solution:
    def invertTree(self, root: TreeNode | None) -> TreeNode | None:
        return self.fun(root)

    def fun(self, root):
        if root is None:
            return None

        temp = root.left
        root.left = self.fun(root.right)
        root.right = self.fun(temp)

        return root