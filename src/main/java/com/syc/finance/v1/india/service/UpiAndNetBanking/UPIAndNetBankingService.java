package com.syc.finance.v1.india.service.UpiAndNetBanking;

import com.syc.finance.v1.india.dto.InternetBanking.GetNetBankingRequest;
import com.syc.finance.v1.india.dto.InternetBanking.NetBankingRequest;
import com.syc.finance.v1.india.dto.InternetBanking.NetBankingResponse;
import com.syc.finance.v1.india.dto.TransferMoney.TransferMoneyRequest;
import com.syc.finance.v1.india.dto.TransferMoney.TransferMoneyResponse;
import com.syc.finance.v1.india.dto.UPI.GetUPIRequest;
import com.syc.finance.v1.india.dto.UPI.UPIRequest;
import com.syc.finance.v1.india.dto.UPI.UPIResponse;

public interface UPIAndNetBankingService {

    UPIResponse upiCreate(UPIRequest upiRequest);
    NetBankingResponse createNetBanking(NetBankingRequest netBankingRequest);
    UPIResponse getYourUpiInInfo(GetUPIRequest upiRequest);
    NetBankingResponse getYourNetBankingInfo(GetNetBankingRequest netBankingRequest);

    TransferMoneyResponse moneyTransferAccountToAccount(TransferMoneyRequest transferMoneyRequest);


}
