package service;

import Servlet.Product;
import repository.ProductRepository;

public class ProductService {
	
	ProductRepository respository =  new ProductRepository();

	public String salvarProduct(Product product ) {
		return this.respository.createProduct(product);
	}
}
