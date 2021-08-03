package array;

import java.util.Arrays;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/3/21 10:07
 */

public class test {

    public static void main(String[] args) {
        int[] data = {20,18,19,21};
        System.out.println("构建数组前的数组为：" + Arrays.toString(data));
        Heap.buildHeap(3, data);
        System.out.println("构建数组后的数组为：" + Arrays.toString(data));

        Heap.adjust(3,data);
        System.out.println("调整后的数组为：" + Arrays.toString(data));

//        int k = 2 ;
//        int i = Array.findKthLargest(data,k);
//        System.out.println("第 " + k + "大的元素是: " + i);


        int[] data1 = {3,2,1,5,6,4};
        Array.findKthLargest(data1,2);
    }
}
