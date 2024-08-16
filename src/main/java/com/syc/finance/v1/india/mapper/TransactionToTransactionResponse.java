package com.syc.finance.v1.india.mapper;

import com.syc.finance.v1.india.dto.Accounts.Transaction.TransactionResponse;
import com.syc.finance.v1.india.entity.TransactionDetailsHistory;

public class TransactionToTransactionResponse {

    public static TransactionResponse transactionToResponse(TransactionDetailsHistory transactionDetailsHistory) {

        TransactionResponse updateMapper = new TransactionResponse();
        updateMapper.setAccountId(transactionDetailsHistory.getTransactionId());
        updateMapper.setDebitedOrCredited(transactionDetailsHistory.getDebitedOrCredited());
        updateMapper.setAccountNumber(transactionDetailsHistory.getAccountNumber());
        updateMapper.setLocalDateTime(transactionDetailsHistory.getLocalDateTime());
        updateMapper.setDebitOrCreditMoney(transactionDetailsHistory.getDebitOrCreditMoney());
        return updateMapper;
    }
}
