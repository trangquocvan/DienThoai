package com.fsoft.mof.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.mof.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
