package com.rayyanshaikh.ecom.services.admin.category;

import com.rayyanshaikh.ecom.dto.CategoryDto;
import com.rayyanshaikh.ecom.entity.Category;

import java.util.List;

public interface CategoryService {
    Category createCategory(CategoryDto categoryDto);

    List<Category> getAllCategories();
}
