package com.syc.finance.v1.india.service.TransactionService;

import com.syc.finance.v1.india.mapper.TransactionToTransactionResponse;
import com.syc.finance.v1.india.dto.Accounts.Transaction.TransactionResponse;
import com.syc.finance.v1.india.dto.Transaction.TransactionRequest;
import com.syc.finance.v1.india.entity.TransactionDetailsHistory;
import com.syc.finance.v1.india.repository.TransactionHistoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    private TransactionHistoryRepository transactionHistoryRepository;

    @Override
    public void saveTransaction(TransactionRequest transactionRequest) {
        TransactionDetailsHistory transactionHistory = new TransactionDetailsHistory();
        transactionHistory.setTransactionId(transactionRequest.getTransactionId());
        transactionHistory.setAccountNumber(transactionRequest.getAccountNumber());
        transactionHistory.setIfscCode(transactionRequest.getIfscCode());
        transactionHistory.setLocalDateTime(transactionRequest.getLocalDateTime());
        transactionHistory.setDebitedOrCredited(transactionRequest.getDebitedOrCredited());
        transactionHistory.setDebitOrCreditMoney(transactionRequest.getDebitOrCreditMoney());
        transactionHistoryRepository.save(transactionHistory);
    }

    @Override
    public List<TransactionResponse> getAllTransaction(String accountNumber) {
        List<TransactionDetailsHistory> transactionDetailsHistories = transactionHistoryRepository.findAllByAccountNumberAndIfscCode(accountNumber);

        return transactionDetailsHistories.stream()
                .map(TransactionToTransactionResponse::transactionToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public long countTransactionsByAccountNumberAndTimestamp(String accountNumber, LocalDateTime startTimestamp, LocalDateTime endTimestamp) {
        return transactionHistoryRepository.countByAccountNumberAndLocalDateTimeBetween(accountNumber, startTimestamp, endTimestamp);
    }

}
