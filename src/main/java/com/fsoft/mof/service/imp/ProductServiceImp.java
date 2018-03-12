package com.fsoft.mof.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.mof.domain.Product;
import com.fsoft.mof.repository.ProductRepository;
import com.fsoft.mof.service.ProductService;
import com.fsoft.mof.service.UserService;
@Service
@Transactional
public class ProductServiceImp implements ProductService {
    private final Logger log = LoggerFactory.getLogger(ProductServiceImp.class);

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<Product> getProductService() {
		// TODO Auto-generated method stub
		log.info("get all product");
		return productRepository.findAll();
	}
	
}
