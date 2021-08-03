package com.galaxy.helloworld.middleware;

import com.galaxy.helloworld.entity.Animal;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 2021-07-15 14:52
 */

public class TestCreate {

    public static void main(String[] args) {
        Animal a = new Animal("Molly","2");
        System.out.println("1" + a.getAge());
        Animal b = a;
        b.setAge("3");
        System.out.println("2" + a.getAge());
    }
}
