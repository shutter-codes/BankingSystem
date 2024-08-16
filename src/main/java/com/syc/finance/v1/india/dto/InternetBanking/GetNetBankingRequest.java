package com.syc.finance.v1.india.dto.InternetBanking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetNetBankingRequest {

    private String accountNumber;
    private String ifscCode;
}
