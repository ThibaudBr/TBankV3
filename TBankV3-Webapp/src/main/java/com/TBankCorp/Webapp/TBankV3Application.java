package com.TBankCorp.Webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EntityScan("com.TBankCorp.Model")
@EnableJpaRepositories("com.TBankCorp.Consumer")
public class TBankV3Application {
    public static void main(String[] args) {
        SpringApplication.run(TBankV3Application.class, args);
    }

}
