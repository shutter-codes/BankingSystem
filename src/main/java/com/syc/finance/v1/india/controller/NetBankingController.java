package com.syc.finance.v1.india.controller;

import com.syc.finance.v1.india.dto.InternetBanking.GetNetBankingRequest;
import com.syc.finance.v1.india.dto.InternetBanking.NetBankingRequest;
import com.syc.finance.v1.india.dto.InternetBanking.NetBankingResponse;
import com.syc.finance.v1.india.service.UpiAndNetBanking.UPIAndNetBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("finance/v1/banking")
public class NetBankingController {

    @Autowired
    private UPIAndNetBankingService upiAndNetBankingService;

    @PostMapping("/net-bankingId-create")
    ResponseEntity<NetBankingResponse> upiCreateUp(@RequestBody NetBankingRequest netBankingRequest){
        NetBankingResponse response = upiAndNetBankingService.createNetBanking(netBankingRequest);
        return new ResponseEntity<NetBankingResponse>(response , HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-internetBanking-details")
    ResponseEntity<NetBankingResponse> getUpiDetails(@RequestBody GetNetBankingRequest netBankingRequest){
        NetBankingResponse response = upiAndNetBankingService.getYourNetBankingInfo(netBankingRequest);
        return new ResponseEntity<NetBankingResponse>(response , HttpStatus.ACCEPTED);
    }

}
