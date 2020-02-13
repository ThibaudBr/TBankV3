package com.TBankCorp.Webapp.controller;

import com.TBankCorp.Consumer.repository.TransactionRepository;
import com.TBankCorp.Model.beans.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@Component
@RestController
@RequestMapping(path = "/api/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController extends AbstractController{

    private Logger log = LoggerFactory.getLogger(ICDController.class);

    @GetMapping(path= "/getAllTransaction")
    public ResponseEntity<ArrayList<Transaction>> getAllTransaction(Map params){
        System.out.print("Bonjour");
        ArrayList<Transaction> list = TransactionRepository.findByIdAccountInitAndIdAccountEnd(1, 1);
    return new ResponseEntity<ArrayList<Transaction>> ( list, HttpStatus.OK);
    }
}
