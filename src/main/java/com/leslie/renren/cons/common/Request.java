package com.leslie.renren.cons.common;

import java.util.Map;

public class Request {
    String type;
    Map<String,String> data;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }
}
