package com.XXXX.lcp.theadDemo;

import com.XXXX.lcp.theadDemo.dto.Tenant;

/**
 * 模拟多线程调用进行参数预封装
 */
public class HtmlRequstRunner implements Runnable{
    TenantAction tenantAction = new TenantAction();

    @Override
    public void run() {
        Tenant tenant = TenantContext.getTenant();

        //开始预设置值
        tenantAction.setTenantId();
        tenantAction.setTenantName();

        System.out.println("tenantId:"+tenant.getTenantID()+"————————"+tenant.getTenantName());

        //清除上下文对象使上下文对象回归初始状态
        //保证每个线程取到的上下文对象都是一样的不影响打印内容
        TenantContext.removeTenant(tenant);
    }
}
