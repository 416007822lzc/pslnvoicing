package com.example.pslnvoicing.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data  (get  set)
//@NoArgsConstructor(有参  构造 )
//@AllArgsConstructor（无参数构造）
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T      data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }
}
