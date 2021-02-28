package com.rado.Shop.db.service.api;

import com.rado.Shop.db.service.api.request.UpdateProductRequest;
import com.rado.Shop.domain.Product;
import org.springframework.lang.Nullable;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();

    @Nullable
    Product get(int id);
    @Nullable
    Integer add(Product product); // returns generated id

    void delete(int id);

    void update(int id, UpdateProductRequest request);
}
