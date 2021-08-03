package string;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/3/21 21:19
 */

public class longestPalindrome1 {

    public static  String longestPalindrome(String s) {


        int left = 0;
        int right = 0;
        int length = 0;
        int maxLength = 0;
        int maxStart = 0;

        if(s.length() == 1 )return s;
        if(s.length() == 0 )return "";

        for (int i = 0; i < s.length(); i++) {



            left = i - 1;
            right = i + 1 ;
            while(left>=0&&s.charAt(left) == s.charAt(i)){
                left--;
                length++;
            }

            while(right<s.length()&&s.charAt(right) == s.charAt(i)){
                right++;
                length++;
            }

            while(right<s.length()&&left>=0&&s.charAt(right) == s.charAt(left)){
                right++;
                left--;
                length= length+2;
            }

            if(length > maxLength){
                maxLength = length;
                maxStart = left+1;
            }

            length = 1;
        }

        return s.substring(maxStart,maxStart+maxLength);



    }
}
