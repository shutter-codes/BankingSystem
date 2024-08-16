package com.syc.finance.v1.india.dto.Accounts;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDeleteAccountDetailsResponse {

    private String userDeleteId;
    private String Message;
}
