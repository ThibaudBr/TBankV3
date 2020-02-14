package com.TBankCorp.Webapp.controller;

import com.TBankCorp.Consumer.repository.TransactionRepository;
import org.springframework.context.annotation.Bean;

abstract class AbstractController {

    private static TransactionRepository transactionRepository;
    protected static TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }
    public static void setTransactionRepository(TransactionRepository pTransactionRepository) {
        transactionRepository = pTransactionRepository;
    }
}
