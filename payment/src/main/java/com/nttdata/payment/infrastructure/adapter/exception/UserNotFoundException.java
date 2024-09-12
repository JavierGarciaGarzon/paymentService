package com.nttdata.payment.infrastructure.adapter.exception;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends PaymentException {
    public UserNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}
