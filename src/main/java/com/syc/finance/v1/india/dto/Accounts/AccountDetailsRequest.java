package com.syc.finance.v1.india.dto.Accounts;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class
AccountDetailsRequest {

    private String accountNumber;
    private String IfscCode;
}
