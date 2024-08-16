package com.syc.finance.v1.india.exceptions;

public class AccountNotFoundStep extends RuntimeException{

    public AccountNotFoundStep(String message){
        super(message);
    }
}
