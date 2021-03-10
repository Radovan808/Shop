package com.rado.Shop.db.service.api;

import com.rado.Shop.db.service.api.request.BuyProductRequest;
import com.rado.Shop.db.service.api.response.BuyProductResponse;

public interface ShoppingService {
    BuyProductResponse buyProduct(BuyProductRequest request);
}
