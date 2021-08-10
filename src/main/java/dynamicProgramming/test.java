package dynamicProgramming;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/5/21 20:24
 */

public class test {

    public static void main(String[] args) {
        dp dp = new dp();
//        System.out.println(dp.climbStairs(3));

        int[] nums = new int[]{1,2,3,1};
        System.out.println(dp.rob(nums));


    }
}
