package com.galaxy.helloworld.entity;

import proxy.proxy.imp.HumanBeavior;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 2021-07-16 10:17
 */

public class HumanA implements HumanBeavior {


    @Override
    public void walking() {
        System.out.println("This is HumanA Walking");
    }
}
