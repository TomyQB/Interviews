package binaryTree;

/*
    Input: root = [4,2,7,1,3,6,9]
    Output: [4,7,2,9,6,3,1]
*/

/*
    Input: root = [2,1,3]
    Output: [2,3,1]
*/

/*
    Input: root = []
    Output: []
*/

public class InvertBinaryTree {

    public static void main(String[] args) {

        // ------------------- 1 -------------------
        TreeNode node11 = new TreeNode(4);
        TreeNode node12 = new TreeNode(2);
        TreeNode node13 = new TreeNode(7);
        TreeNode node14 = new TreeNode(1);
        TreeNode node15 = new TreeNode(3);
        TreeNode node16 = new TreeNode(6);
        TreeNode node17 = new TreeNode(9);

        node11.left = node12;
        node11.right = node13;
        node12.left = node14;
        node12.right = node15;
        node13.left = node16;
        node13.right = node17;

        TreeNode.printTree(node11);
        System.out.println();
        invertTree(node11);
        TreeNode.printTree(node11);
        System.out.println();

        // ------------------- 2 -------------------
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(1);
        TreeNode node23 = new TreeNode(3);

        node21.left = node22;
        node21.right = node23;

        TreeNode.printTree(node21);
        System.out.println();
        invertTree(node21);
        TreeNode.printTree(node21);
        System.out.println();

        // ------------------- 3 -------------------
        TreeNode node31 = new TreeNode();

        TreeNode.printTree(node31);
        System.out.println();
        invertTree(node31);
        TreeNode.printTree(node31);
        System.out.println();

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }

}
