package com.TBankCorp.Webapp.controller;

import com.TBankCorp.Consumer.repository.TransactionRepository;
import com.TBankCorp.Model.beans.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@RequestMapping(path = "/api/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController extends AbstractController {

    private Logger log = LoggerFactory.getLogger(ICDController.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping("/getAllTransaction")
    public List<Transaction> getAllTransaction(){
        System.out.print("Bonjour");
        return (List<Transaction>) transactionRepository.findAll();
    }
}
