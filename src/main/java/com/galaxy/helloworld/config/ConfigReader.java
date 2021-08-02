package com.galaxy.helloworld.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date
 */

@ConfigurationProperties(prefix = "my")
@Component
@Data
public class ConfigReader {

    private String name;
    private int age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;

    @Override
    public String toString(){
        return this.name+" "+this.age+" "+ this.number+" "+this.uuid+" "
                +this.max+" "+this.value+" "+this.greeting+" ";
    }

}

