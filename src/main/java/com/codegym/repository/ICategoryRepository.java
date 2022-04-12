package com.codegym.repository;

import com.codegym.model.Category;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ICategoryRepository extends PagingAndSortingRepository<Category, Long> {
    @Modifying
    @Query(value = "call delete_Category(?1)", nativeQuery = true)
    void deleteAllProductByCategory(Long category_id);
}
