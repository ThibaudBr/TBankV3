package com.TBankCorp.Webapp;

import com.TBankCorp.Consumer.repository.TransactionRepository;
import com.TBankCorp.Model.beans.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.TBankCorp.Consumer.repository")
public class TBankV3Application {
    public static void main(String[] args) {
        SpringApplication.run(TBankV3Application.class, args);
    }

}
