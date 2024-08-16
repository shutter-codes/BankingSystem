package com.syc.finance.v1.india.exceptions;

public class ServiceProviderValidationException extends RuntimeException{

    public ServiceProviderValidationException(String messages){
        super(messages);
    }
}
