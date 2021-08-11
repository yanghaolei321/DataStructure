package view;

import lombok.extern.slf4j.Slf4j;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/10/21 09:49
 */

@Slf4j
public class test {

    public static void main(String[] args) {

        Solution s = new Solution();

        String template1 = "[前缀|][动词][lrc][后缀|]";
        s.split(template1);

//        String template2 = "[前缀1|][歌词][连接语][lrc][conf_song][动词][后缀|]";
//        s.split(template2);

    }

}

