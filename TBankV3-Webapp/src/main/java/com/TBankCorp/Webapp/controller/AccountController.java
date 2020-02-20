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

    private Logger log = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private TransactionRepository transactionRepository;

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/getAllTransaction/{sIdAccount}")
    public List<Transaction> getAllTransaction(@PathVariable String sIdAccount){

        int idAccount = Integer.parseInt(sIdAccount);
        return (List<Transaction>) transactionRepository.findByIdAccountInitAndIdAccountEnd(idAccount,idAccount);
    }

    @GetMapping("/getAccountUtil/{idUtil}")
    public List<Account> getAccountWithIdUtil(@PathVariable int idUtil){
        return (List<Account>) accountRepository.findAllAccountWithIdUtil(idUtil);
    }

    @PostMapping("/deleteAccount")
    public void delete(@RequestBody int idAccount){
        accountRepository.deleteById( idAccount);
    }

    @PostMapping("/addAccount/{idSession}")
    public void addAccount(@PathVariable int idSession, @RequestBody Account account){
        Account accountFinal = buildAccount(idSession,account);
        accountRepository.save(accountFinal);
    }

    @GetMapping("/getAccountWithoutUtil/{idUtil}")
    public List<Account> getAllAccountWithoutUtil(@PathVariable int idUtil) {
        return (List<Account>) accountRepository.findAllAccountWithoutIdUtil(idUtil);
    }
    Account buildAccount(int idSession, Account account){
        account.setIdUtil(idSession);
        return account;
    }


}
