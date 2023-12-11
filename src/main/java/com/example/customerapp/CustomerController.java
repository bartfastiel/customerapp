package com.example.customerapp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clients/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping
    List<Customer> findAll() {
        return service.findAll();
    }

}
