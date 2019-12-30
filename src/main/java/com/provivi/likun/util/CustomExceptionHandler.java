package com.provivi.likun.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class CustomExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CustomResponseBody exceptionHandler(Exception e){
        logger.error(e.getMessage());
        return CustomResponseBody.error(e.getMessage());
    }

    // 404 NOT FOUND
    @ExceptionHandler(NoHandlerFoundException.class)
    public void handleNotFound(NoHandlerFoundException ex) {
        logger.error("404, Page Not Found!");
    }

}
