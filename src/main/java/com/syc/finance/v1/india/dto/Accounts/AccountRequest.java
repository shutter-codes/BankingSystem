package com.syc.finance.v1.india.dto.Accounts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequest {

    private String accountNumber;
    private String ifsccode;
}
