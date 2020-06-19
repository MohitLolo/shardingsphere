package com.coco.shardingsphere.shadnmp.domain;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class R {

    private int code; // 业务状态码

    private String msg; // 响应消息

    private Object data; // 响应内容

    public static R success() {
        return new R().setCode(0).setMsg("success");
    }

    public static R success(String msg) {
        return new R().setMsg(msg).setCode(0);
    }

    public static R success(String msg, Object data) {
        return new R().setMsg(msg).setCode(0).setData(data);
    }

    public static R error() {
        return new R().setCode(-1);
    }

    public static R error(String msg) {
        return new R().setCode(-1).setMsg(msg);
    }

}
