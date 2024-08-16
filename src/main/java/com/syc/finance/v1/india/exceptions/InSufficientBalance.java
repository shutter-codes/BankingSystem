package com.syc.finance.v1.india.exceptions;

public class InSufficientBalance extends RuntimeException{

    public InSufficientBalance(String message){
        super(message);
    }
}
