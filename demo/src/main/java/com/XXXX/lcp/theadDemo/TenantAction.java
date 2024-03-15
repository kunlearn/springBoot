package com.XXXX.lcp.theadDemo;

import com.XXXX.lcp.theadDemo.dto.Tenant;

/**
 * 从上下文获取租户对象给租户赋值
 */
public class TenantAction {

    /**
     * 从上下文获取租户对象并且给对象赋值租户id
     */
    public void setTenantId(){
        Tenant tenant = TenantContext.getTenant();
        tenant.setTenantID(this.getTenantId());
    }

    /**
     * 从上下文获取租户对象并且给对象赋值租户id
     */
    public void setTenantName(){
        Tenant tenant = TenantContext.getTenant();
        String tenantName = "李" + tenant.getTenantID();
        tenant.setTenantName(tenantName);
    }


    /**
     * 获取线程id作为租户id
     * @return
     */
    public String getTenantId(){
        return String.valueOf(Thread.currentThread().getId());
    }
}
