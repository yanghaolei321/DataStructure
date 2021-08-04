package twopointers;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/4/21 09:21
 */

public class TwoPointers {

    /**
     * 11 盛最多水的容器
     *
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {

        // 双指针
        int i = 0;
        int j = height.length-1;

        if(height.length == 0){
            return 0;
        }

        int maxArea = 0;
        while(i<j){
            maxArea = (height[i]<height[j])?Math.max(maxArea,(j-i)*height[i++]):Math.max(maxArea,(j-i)*height[j--]);
        }

        return maxArea;
    }


    /**
     * 15 三数之和
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        if(nums.length<3){
            return ans;
        }


        for (int i = 0; i < nums.length; i++) {

            int left = i+1;
            int right = nums.length-1;
            int sum = 0;

            if(nums[i]>0){
                continue;
            }

            if(i > 0 && nums[i] == nums[i-1]) continue;


            while(left<right){
                sum = nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    // 跳过相同指针 因为是LR一起动。LR只动一边成立的条件就是重复
                    while(left<right&&(nums[left]==nums[left+1])){left++;}
                    while(left<right&&(nums[right]==nums[right-1])){right--;}
                    left++;
                    right--;
                }

                if(sum<0) left++;
                if(sum>0) right--;

            }
        }

        return ans;
    }
}
