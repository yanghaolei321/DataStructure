package view;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import io.netty.util.internal.StringUtil;

import java.util.List;
import java.util.Map;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 8/9/21 19:31
 */

public class Solution {


    /**
     * Input :
     * template1 = "[前缀|][动词][lrc][后缀|]"
     * template2 = "[前缀1|][歌词][连接语][lrc][conf_song][动词][后缀|]"
     * output:
     * List
     * template1：
     * [] 代表必选部分； [| ] 代表可选部分
     * [动词][lrc]
     * [前缀|][动词][lrc][后缀|]
     * [动词][lrc][后缀|]
     * [前缀|][动词][lrc]
     * template2 = "[前缀1|][歌词][连接语][lrc][conf_song|][动词][后缀|]"
     */

    /**
     * 1 2 3 4 5
     *
     *  2 4 必选
     *
     * @param template
     * @return
     */
    public List<List<String>> split(String template) {

      return null;
    }
}
