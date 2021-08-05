package search;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/5/21 14:47
 */

public class search {

    private int ans;

    /**
     * 折半查找
     *
     * @param nums
     * @param target
     * @return
     */
    public  int binarySearch(int[] nums,int target){
        search(0,nums.length-1,nums,target);
        return ans;
    }

    private void search(int begin,int end,int[] nums,int target){
        // 递归结束的条件
        if(begin>end){
            return;
        }

        int mid = (begin+end)/2;
        if(target == nums[mid]){
            ans = mid;
            return;
        }

        if(begin == end){
            if(target>=nums[begin]){ ans = begin+1 ;}
            else{ans = (begin-1)<0?0:(begin-1);}
        }


        if(nums[mid]<target){
            search(mid+1,end,nums,target);
        } else if(nums[mid]>target){
            search(begin,mid-1,nums,target);
        }


    }

    /**
     * 34 搜索插入位置
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {

//        int n = nums.length;
//        int left = 0, right = n - 1, ans = n;
//        while (left <= right) {
//            int mid = ((right - left) >> 1) + left;
//            if (target <= nums[mid]) {
//                ans = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }


        int ans = nums.length;
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int mid = (begin + end) >> 1;
            if (target > nums[mid]) {
                begin = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
