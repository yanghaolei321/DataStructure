package string;

import java.util.HashSet;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/3/21 20:35
 */

public class LengthOfLongestSubstring {

    /**
     * 滑动窗口的目的就是一次遍历完所有的可能性
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> occ = new HashSet<>();
        int rk = 0;
        int ans = 0;

        for(int i=0;i<s.length();i++){

            if(i!=0){
                Character left =s.charAt(i-1);
                occ.remove(left);
            }

            while(rk<s.length()&&!occ.contains(s.charAt(rk))){
                occ.add(s.charAt(rk));
                rk++;
            }

            ans = Math.max(ans,rk-i);

        }

        return ans;

    }



}
