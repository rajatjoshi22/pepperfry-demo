package com.furniture.services;

import java.util.List;

import com.furniture.models.Product;

public interface ProductService {

	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Integer productId);
	
	
	List<Product> getAll();
	List<Product> getByCategory(String category);
	List<Product> getByType(String type);
	List<Product> getByBrand(String brand);
	List<Product> getByTypeAndLowerPrice(String type,double price);
	public List<Product> getByCatAndType(String categoryName,String type );
}
