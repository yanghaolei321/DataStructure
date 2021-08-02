package com.galaxy.helloworld.entity.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Proxy-静态测试代理目标
 *
 * @author yanghaolei
 * @date 下午 2020-08-12 19:59
 */


public class LisonCompany implements InvocationHandler {

    private Object factory;

    public Object getFactory() {
        return factory;
    }

    public void setFactory(Object factory) {
        this.factory = factory;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(), (proxy, method, args) -> {
            try {
                Object ret = method.invoke(factory, args);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            System.out.println("Invocation Handler Method");
            System.out.println("After");

            return null;
        });
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("b");
        try {
            Object ret = method.invoke(factory, args);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("Invocation Handler Method");
        System.out.println("After");

        return null;

    }
}
