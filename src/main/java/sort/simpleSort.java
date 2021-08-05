package sort;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/5/21 09:45
 */

public class simpleSort {

    /**
     * 插入排序
     *
     * @param nums
     * @return
     */
    public static int[] insert(int[] nums){

        for (int i = 1; i < nums.length; i++) {

            // 获取当前值
            int value = nums[i];
            int j=0;

            // 发现比当前值大的都后移
            for(j=i;j>0&&nums[j-1]>value;j--){
                nums[j] = nums[j-1];
            }

            // 当前值和向后的最终双指针交换位置
            nums[j] =value;
        }

        return nums;
    }

    /**
     *
     *
     * @param nums
     * @return
     */
    public static int[] bubbleSort(int[] nums){

        for (int j = nums.length-1; j > 0; j--) {
            for (int i = 1; i < nums.length; i++) {

                if(nums[i]<nums[i-1]){
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] =temp;
                }
            }
        }
        return nums;
    }
}
