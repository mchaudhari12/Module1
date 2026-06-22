package com.coding.module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay() {
        System.out.println("Paying...");
    }

//    @PostConstruct
//    public void afterInti(){
//        System.out.println("Before Paying...");
//    }
//
//    @PreDestroy
//    public void beforeDestroy(){
//        System.out.println("After Payment is done");
//    }
}
