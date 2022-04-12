package com.codegym.service.product;

import com.codegym.model.Product;
import com.codegym.service.IGeneralService;

public interface IProductService extends IGeneralService<Product> {
    Iterable<Product> findProductByNameContaining(String name);
}
