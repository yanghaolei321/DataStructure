package sort;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/5/21 11:08
 */

public class fastSort {

    public static int[] quickSort(int[] nums){

        // 无论如何先判空
        if(nums.length == 0) {
            return nums;
        }

        quickSort(nums,0,nums.length-1);
        return nums;

    }

    private static void quickSort(int[] nums,int left ,int right) {

        // 递归结束的条件
        if (left > right) {
            return;
        }

        //partition
        //复制克隆结点
        int low = left;
        int high = right;
        int pivot = nums[left];

        while (low != high) {

            // 移动high
            while (nums[high] >= pivot && high > left) {
                high--;
            }

            // 移动low
            while (nums[low] <= pivot && high > left) {
                low++;
            }

            if (low < high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
            }
        }

        // left == right
        nums[left] = nums[low];
        nums[low] = pivot;



        // 左端是left  -- pivot-1
        quickSort(nums,left,low-1);

        // 右段是right pivot -right
        quickSort(nums,low+1,right);
    }
}
