package vn.edu.pxu.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import vn.edu.pxu.dao.ProductDAO;
import vn.edu.pxu.model.Product;

public class ProductService {
	@Autowired
	private ProductDAO productDAO;

	@Transactional
	public List<Product> getProducts() {
		return productDAO.getProducts();
	}

}
