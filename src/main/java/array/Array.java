package array;

import java.util.Arrays;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/3/21 10:07
 */

public class Array {

    public static int findKthLargest(int[] nums, int k) {



        System.out.println("构建数组前的数组为：" + Arrays.toString(nums));

        // 构造k大小的堆
        for(int i= 1; i<k;i++){
            int cur = i;

            while(cur!=0&& nums[cur]<nums[(cur-1)/2]){
                int temp = nums[cur];
                nums[cur] = nums[(cur-1)/2];
                nums[(cur-1)/2] = temp;
                cur = (cur-1)/2;
            }
        }

        System.out.println("构建数组后的数组为：" + Arrays.toString(nums));

        // 将剩余元素加入堆

        for(int j=k;j<nums.length;j++){

            if(nums[0]>nums[j]){


            }

            else{
                int temp = nums[j];
                nums[j] = nums[0];
                nums[0] = temp;

                // 当前坐标cur
                int cur = 0;
                while((2*cur+1)<k && nums[cur] > nums[(2*cur+1)] || (2*cur+2)<k && nums[cur] > nums[(2*cur+2)]){


                    // 左孩子比较小 左孩子上升
                    if((2*cur+1)<k && nums[(2*cur+2)] > nums[(2*cur+1)]){
                        temp = nums[cur];
                        nums[cur] = nums[(2*cur+1)];
                        nums[(2*cur+1)] = temp;
                        cur = (2*cur+1);
                    }

                    else{

                        temp = nums[cur];
                        nums[cur] = nums[(2*cur+2)];
                        nums[(2*cur+2)] = temp;
                        cur = (2*cur+2);
                    }

                }
            }


        }


        System.out.println("调整数组后的数组为：" + Arrays.toString(nums));

        return nums[0];
    }
}
