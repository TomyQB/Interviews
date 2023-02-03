package binaryTree;

/*
    Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
    Output: 6
    Explanation: The LCA of nodes 2 and 8 is 6.
*/

/*
    Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
    Output: 2
    Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
*/

/*
    Input: root = [2,1], p = 2, q = 1
    Output: 2
*/

public class LowestCommonAncestor {

    public static void main(String[] args) {

        // ------------------- 1 -------------------
        TreeNode node11 = new TreeNode(6);
        TreeNode node12 = new TreeNode(2);
        TreeNode node13 = new TreeNode(8);
        TreeNode node14 = new TreeNode(0);
        TreeNode node15 = new TreeNode(4);
        TreeNode node16 = new TreeNode(7);
        TreeNode node17 = new TreeNode(9);
        TreeNode node18 = new TreeNode(3);
        TreeNode node19 = new TreeNode(5);

        node11.left = node12;
        node11.right = node13;
        node12.left = node14;
        node12.right = node15;
        node13.left = node16;
        node13.right = node17;
        node15.left = node18;
        node15.right = node19;

        System.out.println(lowestCommonAncestor(node11, node12, node13).val);

        // ------------------- 2 -------------------
        System.out.println(lowestCommonAncestor(node11, node12, node15).val);

        // ------------------- 3 -------------------
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(1);

        node21.left = node22;

        System.out.println(lowestCommonAncestor(node21, node21, node22).val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);

        return root;
    }

}
