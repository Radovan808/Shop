package com.rado.Shop.db.service.impl;

import com.rado.Shop.db.repository.CustomerRepository;
import com.rado.Shop.db.service.api.CustomerService;
import com.rado.Shop.domain.Customer;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getCustomer() {
        return customerRepository.getAll();
    }

    @Override
    public Customer get(int id) {
        return customerRepository.get(id);
    }

    @Override
    public Integer add(Customer customer) {
        return customerRepository.add(customer);
    }
}
