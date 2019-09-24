package com.decidir.sdk.exceptions;

/**
 * Created by biandra on 08/07/16.
 */
public class ValidateException extends DecidirException{

    private ValidateError errorDetail;

    public ValidateException(int status, String message, ValidateError errorDetail) {
        super();
        this.setStatus(status);
        this.setMessage(message);
        this.errorDetail = errorDetail;
    }

    public ValidateError getErrorDetail() {
        return errorDetail;
    }
}
