package com.syc.finance.v1.india.exceptions;

public class DailyLimitExceed extends RuntimeException{

    public DailyLimitExceed(String message){
        super(message);
    }
}
