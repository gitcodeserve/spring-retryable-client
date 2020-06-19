package com.learning.spring.springretryableexample.service;

import com.learning.spring.springretryableexample.exception.MyRuntimeRetryException;
import lombok.extern.log4j.Log4j2;
import org.springframework.retry.annotation.Recover;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class DefaultRetryService implements RetryService {


    @Override
    public String retry() throws MyRuntimeRetryException {
        log.info("Throwing CustomRetryException in method retry");
        throw new MyRuntimeRetryException("Throw custom exception");
    }


    @Recover
    public String recover(Throwable throwable) {
        log.info("Default Retry service test");
        return "Error Class :: " + throwable.getClass().getName();
    }
}
