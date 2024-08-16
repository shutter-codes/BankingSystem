package com.syc.finance.v1.india.exceptions;

public class EmailAlreadyExistStep extends RuntimeException{

    public EmailAlreadyExistStep(String message){
        super(message);
    }
}
