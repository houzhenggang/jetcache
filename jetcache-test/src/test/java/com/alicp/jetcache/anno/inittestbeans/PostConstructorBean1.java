package com.alicp.jetcache.anno.inittestbeans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created on 2017/5/4.
 *
 * @author <a href="mailto:yeli.hl@taobao.com">huangli</a>
 */
@Component
public class PostConstructorBean1 extends MethodCacheInitTestBean {

    @PostConstruct
    public void doTest() {
        super.doTest();
    }


}
