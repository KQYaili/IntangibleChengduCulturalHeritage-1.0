package com.xiaoyv.cultureengine.module;

import java.io.Serializable;

/**
 * 成都非遗文化 App
 *
 * @author 刘国栋
 * @since 2023/12/8
 */
public class BaseBean implements Serializable {
    private static final long serialVersionUID = 6046372893917262217L;
    private boolean success;
    private String msg = "";

    public BaseBean() {

    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setSuccessMsg() {
        this.success = true;
        this.msg = "success";
    }

    public void setErrorMsg() {
        this.success = false;
        this.msg = "error";
    }

    public void setSuccessMsg(String msg) {
        this.success = true;
        this.msg = msg;
    }

    public void setErrorMsg(String msg) {
        this.success = false;
        this.msg = msg;
    }

}
