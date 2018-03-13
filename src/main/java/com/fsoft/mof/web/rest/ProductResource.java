package com.fsoft.mof.web.rest;

import java.net.URI;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.mof.domain.Product;
import com.fsoft.mof.repository.ProductRepository;
import com.fsoft.mof.repository.UserRepository;
import com.fsoft.mof.security.AuthoritiesConstants;
import com.fsoft.mof.service.ProductService;
import com.fsoft.mof.service.UserService;
import com.fsoft.mof.service.imp.ProductServiceImp;
import com.fsoft.mof.web.rest.util.HeaderUtil;
import com.sun.mail.iap.ResponseInputStream;

@RestController
@RequestMapping("/api")
public class ProductResource {
	private Logger logger;
	@Autowired
	ProductService productService;

	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProduct(){
		List<Product> listProduct = productService.getProductService();
		return new ResponseEntity<List<Product>>(listProduct,HttpStatus.OK);
	}
}
