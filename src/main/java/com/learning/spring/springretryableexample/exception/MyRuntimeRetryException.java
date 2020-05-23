package com.learning.spring.springretryableexample.exception;

public class MyRuntimeRetryException extends RuntimeException {

    public MyRuntimeRetryException() {
        super();
    }

    public MyRuntimeRetryException(String message) {
        super("MyRuntimeRetryException - " + message);
    }
}
