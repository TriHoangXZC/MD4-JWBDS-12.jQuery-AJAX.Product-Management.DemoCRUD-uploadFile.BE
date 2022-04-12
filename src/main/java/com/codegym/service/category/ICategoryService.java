package com.codegym.service.category;

import com.codegym.model.Category;
import com.codegym.service.IGeneralService;

public interface ICategoryService extends IGeneralService<Category> {
    void deleteAllProductByCategory(Long category_id);
}
