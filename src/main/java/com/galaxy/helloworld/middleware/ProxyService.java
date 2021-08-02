package com.galaxy.helloworld.middleware;

import com.galaxy.helloworld.entity.proxy.BbFactory;
import com.galaxy.helloworld.entity.proxy.LisonCompany;
import com.galaxy.helloworld.entity.proxy.WomanToolsFactory;
import org.springframework.stereotype.Service;

/**
 * 类的描述
 *
 * @author yanghaolei
 * @date 下午 2020-08-12 19:48
 */

@Service
public class ProxyService {

    private LisonCompany lisonCompany;

    public Boolean goProxy(){
//
//        lisonCompany = new LisonCompany(new BbFactory());
//        WomanToolsFactory proxy = (WomanToolsFactory) lisonCompany.getInstance();
//        proxy.walking();

        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        BbFactory bbFactory = new BbFactory();
        LisonCompany lisonCompany = new LisonCompany();
        lisonCompany.setFactory(bbFactory);
        WomanToolsFactory lison1 = (WomanToolsFactory) lisonCompany.getProxy();
        lison1.saleWomanTools(1.0f);




    }
}
