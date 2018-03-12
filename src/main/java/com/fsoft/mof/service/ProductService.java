package com.fsoft.mof.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

import com.fsoft.mof.domain.Product;
import com.fsoft.mof.repository.ProductRepository;

public interface ProductService {
	
	public List<Product> getProductService();
}
