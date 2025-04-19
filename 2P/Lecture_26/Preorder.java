import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);                    // Visit root
        preorderHelper(node.left, result);       // Traverse left
        preorderHelper(node.right, result);      // Traverse right
    }

    public static void main(String[] args) {
        // Sample tree: [1, null, 2, 3]
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Preorder sol = new Preorder();
        System.out.println("Preorder Traversal: " + sol.preorderTraversal(root)); // Output: [1, 2, 3]
    }
}
