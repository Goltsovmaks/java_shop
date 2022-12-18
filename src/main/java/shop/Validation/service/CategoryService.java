package shop.Validation.service;

import java.util.List;

import shop.domain.Category;


public interface CategoryService {

    void save(Category category);
    List<Category> findAll();
}
