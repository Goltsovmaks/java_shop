package shop.Validation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import shop.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByCategoryName(String name);
}
