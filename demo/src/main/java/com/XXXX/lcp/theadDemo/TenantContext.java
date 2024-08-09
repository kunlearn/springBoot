package com.XXXX.lcp.theadDemo;


import com.XXXX.lcp.theadDemo.dto.Tenant;

import java.util.Objects;

/**
 *  创建上下文对象,用于传递参数，从前段传递到控制层等；
 * @author bangsun
 */
public class TenantContext {


    private static final ThreadLocal<Tenant> threadLocal =  new ThreadLocal<Tenant>(){
        @Override
        protected Tenant initialValue() {
            return new Tenant();
        }
    };

    /**
     * 定义获取线程中租户静态方法
     * @return
     */
    public static Tenant getTenant(){
        return threadLocal.get();
    }

    /**
     * 定义移除线程中租户静态方法
     * @param key
     */
    public static void removeTenant(Object key){
        Tenant tenant = threadLocal.get();
        if(Objects.nonNull(tenant)){
            threadLocal.remove();
        }
    }

}
