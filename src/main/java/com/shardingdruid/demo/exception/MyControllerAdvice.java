package com.shardingdruid.demo.exception;

import com.shardingdruid.demo.constant.ResponseCode;
import com.shardingdruid.demo.util.ServerResponseUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerAdvice {


    @ResponseBody
    @ExceptionHandler(ServiceException.class)
    public ServerResponseUtil serviceExceptionHandler(ServiceException se) {
        //System.out.println("-----------serviceExceptionHandler begin");
        return ServerResponseUtil.error(se.getMsg());
    }

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ServerResponseUtil exceptionHandler(Exception e) {
        //log.error("Exception: ", e);
        //System.out.println("e");
        //System.out.println(e.toString());
        //System.out.println("-----------exceptionHandler begin");
        return ServerResponseUtil.error(ResponseCode.SERVER_ERROR.getMsg());
    }

}