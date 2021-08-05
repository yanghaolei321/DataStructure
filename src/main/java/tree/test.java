package tree;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/4/21 15:02
 */

public class test {




    public static void main(String[] args) {

        TreeNode L7 = new TreeNode(2);
        TreeNode L6 = new TreeNode(7);
        TreeNode L3 = new TreeNode(11,L6,L7);
        TreeNode L1 = new TreeNode(4,L3,null);

        TreeNode L8 = new TreeNode(5);
        TreeNode L9 = new TreeNode(1);
        TreeNode L4 = new TreeNode(13);
        TreeNode L5 = new TreeNode(4,L8,L9);

        TreeNode R1 = new TreeNode(8,L4,L5);

        TreeNode D = new TreeNode(5,L1,R1);

        //  DLR 前序遍历
//        Traverse t = new Traverse();
//        t.preorderTraversal1(D);
//        t.preorderTraversal2(D);
//        t.inorderTraversal1(D);
//        t.inorderTraversal2(D);
//        t.postorderTraversal2(D);
        DFS dfs = new DFS();
//        dfs.pathSum(D,22);
        dfs.lowestCommonAncestor(D,L3,L5);
    }



}
