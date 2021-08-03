package collection;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/3/21 18:39
 */

public class twoSum {

    public static int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for(int i =0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    first = i;
                    second = j;
                    return new int[]{first,second};
                }
            }
        }

        return new int[]{0,0};
    }
}
