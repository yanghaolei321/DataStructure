package com.galaxy.helloworld.invcationHandler;

import proxy.proxy.imp.HumanBeavior;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 2021-07-16 10:29
 */

public class InvactionHandler implements InvocationHandler {

    public HumanBeavior relObj;

    public InvactionHandler(HumanBeavior relObj){
        this.relObj = relObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("This is advanced Pre");
        method.invoke(relObj, args);
        System.out.println("This is advanced Post");
        return null;
    }
}
