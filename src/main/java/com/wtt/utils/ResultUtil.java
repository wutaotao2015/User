package com.wtt.utils;

import com.wtt.domain.Result;

/**
 * Created by wutaotao
 * 2018/1/7 15:52
 */
public class ResultUtil {

    public static Result success(Object... object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("success");
        result.setData(object);
        return result;
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        return result;
    }
}
