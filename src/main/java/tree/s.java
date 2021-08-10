package tree;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/9/21 16:33
 */

public class s {

    private final Integer Three = 3;
    private final Integer Five = 5;


    /**
     * 说明
     * 可以选用擅长的语言完成，例如 C、C++、Java、C#、Javascript、Python、Scala、Objective-c 等 必须有自动化测试代码进行验证。
     * 有100名小朋友正在上课。老师在教他们玩一个报数游戏。老师让所有学生排成一队，然后从1开始，按顺序报数。当学生报数时，要按下列规则报数。
     * 如果所报数字是「3」的倍数或所报数字中包含字符「3」，那么所报内容是“Fizz”，而不是该数字；
     * 如果所报数字是「5」的倍数或所报数字中包含字符「5」，那么所报内容是“Buzz”，而不是该数字；
     * 如果同时满足以上两个规则 ，所报内容应该同时包含“Fizz”和“Buzz”，而且Fizz在前，Buzz在后。
     * 如果该数字不满足以上规则，则直接说出该数字即可。
     * 要求 使用程序模拟执行上述要求，打印出 从1~100所报的内容。每行打印一个报数内容。
     */
    public void print() {
        List<Integer> nums = Lists.newArrayList(3, 5);
        for (int i = 0; i < 100; i++) {
            printf(i, nums);
        }
    }


    /**
     * check
     *
     * @param n
     * @param nums 目标数组
     * @return
     */
    private void printf(int n, List<Integer> nums) {
        Map<Integer, Boolean> ans = Maps.newHashMap();
        nums.stream().forEach(target -> {
                if (n % target == 0 || contains(n, target)) {
                    ans.putIfAbsent(target, true);
                }
            }
        );

        for (int key : ans.keySet()) {
            if (n == Three && n == Five) {
                System.out.println( "Fizz" + "Buzz");
            } else if (n == Three) {
                System.out.println( "Fizz");
            } else if (n == Five) {
                System.out.println( "Buzz");
            } else {
                System.out.println( " " + n);
            }

        }
    }

    /**
     * contains
     *
     * @param n
     * @param target
     * @return
     */
    private Boolean contains(int n, int target) {
        String targetString = target + "";
        String s = Integer.toOctalString(n);
        return (s.contains(targetString)) ? Boolean.TRUE : Boolean.FALSE;
    }
}
