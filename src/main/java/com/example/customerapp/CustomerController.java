package com.example.customerapp;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/clients/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService service;

    @GetMapping
    List<ApiCustomer> findAll() {
        List<Customer> customersFromDatabase = service.findAll();
        List<ApiCustomer> customersToReturn = new ArrayList<>();
        for (Customer customer : customersFromDatabase) {
            ApiCustomer x = new ApiCustomer(
                    customer.id(),
                    customer.firstName(),
                    customer.lastName()
            );
            customersToReturn.add(x);
        }
        return customersToReturn;
    }

}
