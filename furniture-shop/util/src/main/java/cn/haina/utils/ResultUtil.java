package cn.haina.utils;

/**
 * 统一返回类
 */
public class ResultUtil {
    private Integer status;
    private String msg;
    private Object obj;

    private ResultUtil() {
    }

    public static ResultUtil build() {
        return new ResultUtil();
    }

    public static ResultUtil ok(String msg, Object obj) {
        return new ResultUtil(200, msg, obj);
    }

    public static ResultUtil ok(String msg) {
        return new ResultUtil(200, msg, null);
    }

    public static ResultUtil error(String msg, Object obj) {
        return new ResultUtil(500, msg, obj);
    }

    public static ResultUtil error(String msg) {
        return new ResultUtil(500, msg, null);
    }

    private ResultUtil(Integer status, String msg, Object obj) {
        this.status = status;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStatus() {

        return status;
    }

    public ResultUtil setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ResultUtil setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public ResultUtil setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}
