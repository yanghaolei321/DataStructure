package DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/4/21 10:28
 */

public class LetterCombinations {
    Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};


    List<String> ans = new ArrayList<>();

    public  List<String> letterCombinations(String digits) {

        //启动条件
        if(digits.equals(""))return ans;

        //递归的启动
        find(digits,0,"");
        return ans;
    }

    private  void find(String digits,int index,String s){

        //递归的终止条件
        if (index == digits.length()){
            ans.add(s);
            return;
        }

        //递归的动作
        Character ch = digits.charAt(index);
        String letters = phoneMap.get(ch);
        for(int i =0;i<letters.length();i++){
            find(digits,index+1,s + letters.charAt(i));
        }

    }

}
