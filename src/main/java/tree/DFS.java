package tree;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/4/21 20:04
 */

public class DFS {

    /**
     * 113 路径总和2
     *
     * 根结点到叶子结点的所有路径
     *
     *
     * @param root
     * @param sum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, sum, new ArrayList<>(), result);
        return result;
    }

    public void dfs(TreeNode root, int sum, List<Integer> list,
                    List<List<Integer>> result) {
        //如果节点为空直接返回
        if (root == null) {
            return;
        }
        //把当前节点值加入到list中
        list.add(new Integer(root.val));
        //如果到达叶子节点，就不能往下走了，直接return
        if (root.left == null && root.right == null) {
            //如果到达叶子节点，并且sum等于叶子节点的值，说明我们找到了一组，
            //要把它放到result中
            if (sum == root.val) {
                result.add(new ArrayList(list));
            }
            //注意别忘了把最后加入的结点值给移除掉，因为下一步直接return了，
            //不会再走最后一行的remove了，所以这里在rerurn之前提前把最后
            //一个结点的值给remove掉。
            list.remove(list.size() - 1);
            //到叶子节点之后直接返回，因为在往下就走不动了
            return;
        }
        //如果没到达叶子节点，就继续从他的左右两个子节点往下找，注意到
        //下一步的时候，sum值要减去当前节点的值
        dfs(root.left, sum - root.val, list, result);
        dfs(root.right, sum - root.val, list, result);
        //我们要理解递归的本质，当递归往下传递的时候他最后还是会往回走，
        //我们把这个值使用完之后还要把它给移除，这就是回溯
        list.remove(list.size() - 1);
    }


    /**
     * 236 二叉树的最近公共祖先
     *
     * 找到P或Q以后存储路径 然后在最远的公共结点
     *
     * @param root
     * @param p
     * @param q
     * @return
     */
    public  TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode ans = new TreeNode();
        if(root==null){
            return ans;
        }

        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();

        preOrder(root,11,path1,0);
        preOrder(root,4,path2,0);

//        int length = Math.min(path1.size(),path2.size());
//        for (int i = 0; i < length; i++) {
//            if(path1.get(i).equals(path2.get(i))){
//                return path1.get(i);
//            }
//        }


        return null;


    }

    private void preOrder(TreeNode node,Integer target,List<Integer> path,int finish){

        //递归结束的条件
        if(node == null || finish == 1){
            return;
        }

        //前序遍历对头节点进行处理
        path.add(node.val);
        if(node.val == target){
            finish = 1;
        }

        preOrder(node.left,target,path,finish);
        preOrder(node.right,target,path,finish);

    }


}
