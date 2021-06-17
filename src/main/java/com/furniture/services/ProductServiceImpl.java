package com.furniture.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furniture.models.Product;
import com.furniture.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

@Autowired
ProductRepository productRepository;
	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		 productRepository.save(product);
	}

	@Override
	public void  updateProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
	   productRepository.deleteById(productId);;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public List<Product> getByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.findByCategory(category);
	}

	@Override
	public List<Product> getByType(String type) {
		// TODO Auto-generated method stub
		return productRepository.findByTypeType(type);
	}

	@Override
	public List<Product> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return productRepository.findByBrandBrandName(brand);
	}


	@Override
	public List<Product> getByTypeAndLowerPrice(String type, double price) {
		// TODO Auto-generated method stub
		return productRepository.findByTypeAndPrice(type, price);
	}

	@Override
	public List<Product> getByCatAndType(String categoryName, String type) {
		// TODO Auto-generated method stub
		return productRepository.findByCatAndType(categoryName, type);
	}

}
