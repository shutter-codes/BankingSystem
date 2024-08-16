package com.syc.finance.v1.india.service.TransactionService;

import com.syc.finance.v1.india.dto.Accounts.Transaction.TransactionResponse;
import com.syc.finance.v1.india.dto.Transaction.TransactionRequest;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionService {

    void saveTransaction(TransactionRequest transactionRequest);
    List<TransactionResponse> getAllTransaction(String accountNumber);
    long countTransactionsByAccountNumberAndTimestamp(String accountNumber, LocalDateTime twentyFourHoursAgo, LocalDateTime currentDateTime);
}
