package array;

/**
 * 堆
 *
 * https://blog.csdn.net/u013278314/article/details/83783345
 * @see
 * @author yanghaolei
 * @date 下午 8/3/21 10:59
 */

public class Heap {

    /**
     * 父节点
     */
    private static int parent(int n) {
        return (n - 1) / 2;
    }

    /**
     * 左孩子
     */
    private static int left(int n) {
        return 2 * n + 1;
    }

    /**
     * 右孩子
     */
    private static int right(int n) {
        return 2 * n + 2;
    }

    /**
     * 构建堆
     *
     * @param n
     *            构建包含n个节点的堆
     * @param data
     *            构建堆的数据
     */
    public static void buildHeap(int n, int[] data) {
       for(int i=1;i<n;i++){
           int cur = i;

           while(cur!=0&&data[cur]<data[parent(cur)]){

               //swap current and parent
               int temp = data[cur];
               data[cur] = data[parent(cur)];
               data[parent(cur)] = temp;

               //upstairs
               cur = parent(cur);
           }
       }
    }

    /**
     * 调整堆
     *
     * @param n
     *            从第n个数开始 不在之前构建的堆里面
     * @param data
     *            需要被调整的数据
     */
    public static void adjust(int n, int[] data) {

        for(int j=n;j<data.length;j++){

            // 比最小堆的顶点 不用考虑
            if(data[j]<data[0]){
                return;
            }

            // 先交换顶点 因为它确定比顶点大了顶点就滚了
            int temp = data[0];
            data[0] =data[j];
            data[j] = temp;

            // 标记当前位置
            int cur = 0;

            // 向下浮动
            while(left(cur)<n && data[cur]> data[left(cur)] || right(cur)<n && data[cur] > data[right(cur)]){

                // 下浮这一层比较的是左右 要和左右中较小的一个上浮
                if(left(cur)<n && data[right(cur)]> data[left(cur)]){
                    temp = data[cur];
                    data[cur] =data[left(cur)];
                    data[left(cur)] = temp;
                    cur = left(cur);

                } else{

                    temp = data[cur];
                    data[cur] =data[right(cur)];
                    data[right(cur)] = temp;
                    cur = right(cur);
                }

            }


        }


    }

}
