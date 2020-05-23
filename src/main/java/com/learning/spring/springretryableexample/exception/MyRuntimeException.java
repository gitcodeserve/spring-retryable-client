package com.learning.spring.springretryableexample.exception;

public class MyRuntimeException extends RuntimeException{

    public MyRuntimeException(){
        super();
    }

    public MyRuntimeException(String errorMessage) {
        super("MyRuntimeException " + errorMessage);
    }
}
