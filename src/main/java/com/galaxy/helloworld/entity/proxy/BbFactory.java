package com.galaxy.helloworld.entity.proxy;


/**
 * Proxy-静态测试代理目标
 *
 * @author yanghaolei
 * @date 下午 2020-08-12 19:55
 */


public class BbFactory implements WomanToolsFactory {

    @Override
    public void saleWomanTools(float length) {
        System.out.println(" ====  sale ===== " + length );
    }
}
