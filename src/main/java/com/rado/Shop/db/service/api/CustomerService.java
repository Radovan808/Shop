package com.rado.Shop.db.service.api;

import com.rado.Shop.domain.Customer;
import org.springframework.lang.Nullable;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomer();

    @Nullable
    Customer get(int id);
    @Nullable
    Integer add(Customer customer); // returns generated id
}
