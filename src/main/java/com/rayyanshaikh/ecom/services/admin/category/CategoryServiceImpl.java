package com.rayyanshaikh.ecom.services.admin.category;

import com.rayyanshaikh.ecom.dto.CategoryDto;
import com.rayyanshaikh.ecom.entity.Category;
import com.rayyanshaikh.ecom.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private final CategoryRepository categoryRepository;

    public Category createCategory(CategoryDto categoryDto){
        System.out.println("category service impl reached.");
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return categoryRepository.save(category);
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
