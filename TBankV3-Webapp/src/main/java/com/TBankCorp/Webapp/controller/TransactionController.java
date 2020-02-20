package com.TBankCorp.Webapp.controller;


import com.TBankCorp.Consumer.repository.AccountRepository;
import com.TBankCorp.Consumer.repository.TransactionRepository;
import com.TBankCorp.Model.beans.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
@RestController
@RequestMapping(path = "/api/transaction/")
@CrossOrigin(origins = "http://localhost:4200")
public class TransactionController extends AbstractController{

    private Logger log = LoggerFactory.getLogger(TransactionController.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/postNewTransaction")
    public void postNewTransaction(@RequestBody Transaction transaction){
        //formatage de la class Transaction
        transaction.setIdUtilEnd(accountRepository.getIdUtilEndWithIdAccountEnd(transaction.getIdAccountEnd()));
        transaction.setDate(getDateNow());
        transactionRepository.save(transaction);

        //Retrait de transaction.amount sur le compte Init
        accountRepository.updateAccountInit(transaction.getIdAccountInit(),getNewAmountInit(transaction));

        //Ajout de transaction.amount sur le compte End
        accountRepository.updateAccountEnd(transaction.getIdAccountEnd(),getNewAmountEnd(transaction));

    }

    private int getNewAmountEnd( Transaction transaction) {
        int newAmount = accountRepository.getAmount(transaction.getIdAccountEnd()) + transaction.getAmount();
        return newAmount;
    }

    private int getNewAmountInit(Transaction transaction) {
        int newAmount = accountRepository.getAmount(transaction.getIdAccountInit()) - transaction.getAmount();
        return newAmount;
    }


    public String getDateNow(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return LocalDate.now().format(formatter);
    }
}
