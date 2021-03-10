package com.rado.Shop.db.service.impl;

import com.rado.Shop.db.repository.BoughtProductRepository;
import com.rado.Shop.db.service.api.BoughtProductService;
import com.rado.Shop.domain.BoughtProduct;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BoughtProductServiceImpl implements BoughtProductService {

    private BoughtProductRepository boughtProductRepository;

    public BoughtProductServiceImpl(BoughtProductRepository boughtProductRepository) {
        this.boughtProductRepository = boughtProductRepository;
    }

    @Override
    public void add(BoughtProduct boughtProduct) {
        boughtProductRepository.add(boughtProduct);
    }

    @Override
    public List<BoughtProduct> getAllByCustomerId(int customerId) {
        return boughtProductRepository.getAllByCustomerId(customerId);
    }
}
