package com.fsoft.mof.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="product")
public class Product extends AbstractAuditingEntity implements Serializable {
    	private static final long serialVersionUID = 1L;

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int idProduct;
	 @NotNull
	 @Column(name="product_name")
	 private String nameProduct;
	 @NotNull
	 @Column(name="images")
	 private String images;
	 @NotNull
	 @Column(name="price")
	 private int price;
	 @Column(name="quantity")
	 private int quantity;
	 
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(int idProduct, String nameProduct, String images, int price, int quantity) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.images = images;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product() {
	}
	@Override
	public String toString() {
		return "Product [idProduct=" + idProduct + ", nameProduct=" + nameProduct + ", images=" + images + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
}
