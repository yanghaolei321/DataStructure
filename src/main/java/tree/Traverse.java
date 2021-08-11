package tree;

import view.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/4/21 14:53
 */

public class Traverse {


    /**
     * 树的前序遍历
     *
     * @param root
     * @return
     */
    public  List<Integer> preorderTraversal1(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        traverse(root,ans);
        return ans;
    }

    private  void traverse(TreeNode node,List<Integer> ans){

        //递归的结束条件
        if(node == null){
            return;
        }

        System.out.println("当前结点的值: " + node.val);
        ans.add(node.val);
        traverse(node.left,ans);
        traverse(node.right,ans);

    }

    /**
     * 栈
     *
     * @param root
     * @return
     */
    public List<Integer> preorderTraversal2(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            System.out.println("当前结点的值: " + node.val);
            ans.add(node.val);

            if(node.right!=null){
                stack.push(node.right);
            }

            if(node.left!=null) {
                stack.push(node.left);
            }

        }
        return ans;
    }


    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        //无论干啥 先判空
        if(root == null) return ans;
        inorder(root,ans);
        return ans;

    }

    private void inorder(TreeNode node, List<Integer> ans){
        //递归结束的条件
        if(node==null){
            return;
        }

        inorder(node.left,ans);
        System.out.println("当前结点的值: " + node.val);
        ans.add(node.val);
        inorder(node.right,ans);

    }

    /**
     * 中序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root==null){
            return ans;
        }

        TreeNode cur = root;
        while(!stack.empty() || cur!=null){

            // 尽量把左子树全部压入栈
            while(cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            // 弹出最上面的左结点
            TreeNode node = stack.pop();
            System.out.println("当前结点的值: " + node.val);
            ans.add(node.val);

            // 再把当前结点的值赋予给右结点 遍历右子树
            if(node.right!=null){
                cur = node.right;
            }

        }

        return  ans;

    }


    /**
     * 后序遍历
     *
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        post(root,ans);
        return ans;
    }


    private void post(TreeNode node,List<Integer> ans){

        //递归结束的条件
        if(node == null){
            return;
        }

        post(node.left,ans);
        post(node.right,ans);
        System.out.println();
        System.out.println("当前结点的值: " + node.val);
        ans.add(node.val);
    }


    /**
     * 后序 双栈法
     *
     * 因为后序的顺序是LRD 所以压入结果栈的顺序是DRL就可以了
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stack1= new Stack<>();
        Stack<TreeNode> stack2= new Stack<>();
        stack1.push(root);
        while(!stack1.empty()){
            TreeNode node = stack1.pop();
            stack2.push(node);

            if(node.left!=null){
                stack1.push(node.left);
            }

            if(node.right!=null){
                stack1.push(node.right);
            }
        }

        while (!stack2.empty()){
            TreeNode node = stack2.pop();
            System.out.println("当前结点的值: " + node.val);
            ans.add(node.val);
        }


        return ans;



    }


}
