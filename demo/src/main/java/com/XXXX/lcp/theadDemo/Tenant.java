package com.XXXX.lcp.theadDemo;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

@Data
public class Tenant {

    private String tenantID;

    private String tenantName;

    @Override
    public String toString() {
        return JSONObject.toJSONString(this
        );
    }
}
