package com.vaadin.flow.spring.fusionsecurity.endpoints;

import jakarta.annotation.security.PermitAll;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.spring.fusionsecurity.service.BankService;
import dev.hilla.Endpoint;
import reactor.core.publisher.Flux;

@Endpoint
@PermitAll
public class BalanceEndpoint {

    @Autowired
    private BankService bankService;

    public BigDecimal getBalance() {
        return bankService.getBalance();
    }

    public void applyForLoan() {
        bankService.applyForLoan();
    }

    public Flux<BigDecimal> getBalanceUpdates() {
        return Flux.fromStream(Stream.of(bankService.getBalance()));
    }
}
