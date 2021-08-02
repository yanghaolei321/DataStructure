package com.galaxy.helloworld.entity;

import com.galaxy.helloworld.service.animalAction;
import lombok.AllArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date
 */
@AllArgsConstructor
public class monkey implements animalAction {


    public String name;
    public String age;

    @Override
    public String shout(String voice) {
        return "Shouting " + voice;
    }

    @Override
    public String toString() {
        return "";
    }


}
