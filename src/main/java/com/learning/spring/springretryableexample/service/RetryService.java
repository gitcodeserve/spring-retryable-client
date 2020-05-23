package com.learning.spring.springretryableexample.service;


import com.learning.spring.springretryableexample.exception.MyRuntimeException;
import com.learning.spring.springretryableexample.exception.MyRuntimeRetryException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;

public interface RetryService {

    /*
    @Retryable annotation provides options to customize the retry behavior. Here are the details.

    - value attribute tells Spring retry to act if the method throws CustomRetryException or CustomException.
    - maxAttempts set the maximum number of retry. If you do not specify the default value is 3.
    - backoff specify the delay in the next retry. The default value is 1 second.
     */

    @Retryable(value = {
            MyRuntimeRetryException.class}, maxAttempts = 4, backoff = @Backoff(5000))
    public String retry() throws MyRuntimeRetryException, MyRuntimeException;
}
