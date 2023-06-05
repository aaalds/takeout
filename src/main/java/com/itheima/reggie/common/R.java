package com.itheima.reggie.common;

import lombok.Data;
<<<<<<< HEAD

import java.io.Serializable;
=======
>>>>>>> 2e6a2cbd12365f1003a00906ed1d7685aa9d82de
import java.util.HashMap;
import java.util.Map;

/**
 * 通用返回结果，服务端响应的数据最终都会封装成此对象
 * @param <T>
 */
@Data
<<<<<<< HEAD
public class R<T> implements Serializable{
=======
public class R<T> {
>>>>>>> 2e6a2cbd12365f1003a00906ed1d7685aa9d82de

    private Integer code; //编码：1成功，0和其它数字为失败

    private String msg; //错误信息

    private T data; //数据

    private Map map = new HashMap(); //动态数据

    public static <T> R<T> success(T object) {
        R<T> r = new R<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public R<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
