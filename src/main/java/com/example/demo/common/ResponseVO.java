package com.example.demo.common;

public class ResponseVO {

    private String code;
    private String msg;
    private Object data;

    public ResponseVO(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public static ResponseVO success(){
        return new ResponseVO("200","操作成功");
    }

    public static ResponseVO fail(){
        return new ResponseVO("400","操作失败");
    }

    public ResponseVO setDatas(Object data){
        this.setData(data);
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
