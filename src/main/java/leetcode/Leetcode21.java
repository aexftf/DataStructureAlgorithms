package leetcode;
import javax.swing.tree.TreeNode;
/**
 * @author DELL
 * 判断是否是对称数
 */
public class Leetcode21 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.right, q.left) && isSameTree(p.right, q.right);
        }
    }






}
