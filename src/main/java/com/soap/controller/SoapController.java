package com.soap.controller;


import com.soap.client.SoapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/operation")
public class SoapController {
    private final SoapClient soapClient;
    public SoapController(SoapClient soapClient) {
        this.soapClient = soapClient;
    }


    @PostMapping(path = "/add")
    public ResponseEntity<Map<String,Integer>> add(@RequestParam int numA, @RequestParam int numB) {
        Map<String,Integer> response = new HashMap<>();
        response.put("result",this.soapClient.getAddResponse(numA, numB).getAddResult());
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/subtract")
    public ResponseEntity<Map<String,Integer>> subtract(@RequestParam int numA, @RequestParam int numB) {
        Map<String,Integer> response = new HashMap<>();
        response.put("result",this.soapClient.getSubtractResponse(numA, numB).getSubtractResult());
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/multiply")
    public ResponseEntity<Map<String,Integer>> multiply(@RequestParam int numA, @RequestParam int numB) {
        Map<String,Integer> response = new HashMap<>();
        response.put("result",this.soapClient.getMultiplyResponse(numA, numB).getMultiplyResult());
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/divide")
    public ResponseEntity<Map<String,Integer>> divide(@RequestParam int numA, @RequestParam int numB) {
        Map<String,Integer> response = new HashMap<>();
        response.put("result",this.soapClient.getDivideResponse(numA, numB).getDivideResult());
        return ResponseEntity.ok(response);
    }

}
