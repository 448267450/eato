package com.dining.eato.common;

import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Generic response result, the data returned by the server will ultimately be encapsulated in this object.
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private Integer code; //1: succ; 0/others: fail

    private String msg; //error msg

    private T data;

    private Map map = new HashMap();

    public static <T> Result<T> success(T object) {
        Result<T> r = new Result<T>();
        r.data = object;
        r.code = 1;
        return r;
    }

    public static <T> Result<T> error(String msg) {
        Result r = new Result();
        r.msg = msg;
        r.code = 0;
        return r;
    }

    public Result<T> add(String key, Object value) {
        this.map.put(key, value);
        return this;
    }

}
