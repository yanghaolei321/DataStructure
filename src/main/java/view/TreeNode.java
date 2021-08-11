package view;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/4/21 14:51
 */

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){

    }

    public TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    /**
     * 根结点
     *
     * @param val
     */
    public TreeNode(int val){
        this.val = val;
    }


    }
