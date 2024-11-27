package repository;

import Servlet.Product;

public class ProductRepository {

	public String createProduct(Product product) {
		
		String sql = String.format("INSERT INTO PRODUCT (COD, DESCRICAO, VALOR) VALUES (%d, %s, %s)", product.getCod(),product.getDescricao(),product.getValor().toString().replace(",","."));
		return sql;
	}
}
