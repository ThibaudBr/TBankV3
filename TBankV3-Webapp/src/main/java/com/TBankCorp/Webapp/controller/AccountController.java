package com.TBankCorp.Webapp.controller;

import com.TBankCorp.Consumer.repository.AccountRepository;
import com.TBankCorp.Consumer.repository.TransactionRepository;
import com.TBankCorp.Model.beans.Account;
import com.TBankCorp.Model.beans.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
@RequestMapping(path = "/api/account")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController extends AbstractController {

    private Logger log = LoggerFactory.getLogger(ICDController.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/getAllTransaction/{sIdAccount}")
    public List<Transaction> getAllTransaction(@PathVariable String sIdAccount){

        int idAccount = Integer.parseInt(sIdAccount);
        return (List<Transaction>) transactionRepository.findByIdAccountInitAndIdAccountEnd(idAccount,idAccount);
    }

    @PostMapping("/deleteAccount/{sIdAccount}")
    public void delete(@PathVariable String sIdAccount){
        long idAccount = Long.parseLong(sIdAccount);
        accountRepository.deleteById((long) idAccount);
    }

    @PostMapping("/addAccount/{idSession}")
    public void addAccount(@PathVariable int idSession, @RequestBody Account account){
        Account accountFinal = buildAccount(idSession,account);
        accountRepository.save(accountFinal);
    }

    Account buildAccount(int idSession, Account account){
        account.setIdUtil(idSession);
        return account;
    }
}
