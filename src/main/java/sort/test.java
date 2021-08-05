package sort;

import array.Array;

import java.util.Arrays;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/5/21 09:48
 */

public class test {

    public static void main(String[] args) {
        int[] nums = new int[]{49,38,88,97,76,13,27};
//        System.out.println(Arrays.toString(simpleSort.insert(nums)));
//        System.out.println(Arrays.toString(simpleSort.bubbleSort(nums)));
        System.out.println(Arrays.toString(fastSort.quickSort(nums)));


    }
}
