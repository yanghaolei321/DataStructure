package dynamicProgramming;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/5/21 19:54
 */

public class dp {

    /**
     *  70 爬楼梯
     *
     * @param n
     * @return
     */
    public  int climbStairs(int n){

      //建立dp数组
        int[] dp = new int[n+1];

        //初始条件
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        //状态转移方程
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }


    /**
     * 198 打家劫舍
     *
     * @param nums
     * @return
     */
    public  int rob(int[] nums) {

        //建立dp数组
        int[] dp = new int[nums.length+1];

        //初始条件
        dp[0] = 0;
        dp[1] = nums[0];

        //递推dp
        for(int i = 2;i<=nums.length;i++){
            dp[i] = Math.max(dp[i-1],(dp[i-2]+nums[i-1]));
        }

        return dp[nums.length];

    }


    public int maxSubArray(int[] nums) {

        //建立dp数组
        int[] dp = new int[nums.length+1];

        //初始条件
        dp[0] = 0;
        dp[1] = nums[0];
        int max= dp[1];

        //动态转移方程
        for(int i = 2;i<=nums.length;i++){
            dp[i] = Math.max(dp[i-1]+nums[i-1],nums[i-1]);
        }

        return dp[nums.length];

    }

}
