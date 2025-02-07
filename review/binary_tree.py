from collections import deque

class TreeNode:

    def __init__(self, val):
        self.val = val
        self.left = TreeNode | None
        self.right = TreeNode | None


class TreeTraversals:

    @staticmethod
    def level_order(root: TreeNode):
        """
        Binary Tree Structure:
        
                8
               / \
              3   10
             / \    \
            1   6    14
               / \   /
              4   7 13
        
        Level-order Traversal: 8 → 3 → 10 → 1 → 6 → 14 → 4 → 7 → 13
        """

        
        q: deque[TreeNode] = deque()
        q.append(root)

        res = []
        
        # O(n) time complexity -- all nodes visited once
        while q:
            node = q.popleft()
            res.append(node.val)
            if node.left:
                q.append(node.left)
            if node.right:
                q.append(node.right)
        
        return res

def main():
    pass


if __name__ == '__main__':
    main()