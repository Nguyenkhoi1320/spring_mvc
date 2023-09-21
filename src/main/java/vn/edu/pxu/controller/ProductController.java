package vn.edu.pxu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.edu.pxu.model.Product;
import vn.edu.pxu.service.ProductService;

public class ProductController {
	@Autowired
	public ProductService productService;

	@GetMapping("/list")
	public String listProducts(Model theModel) {
		List<Product> theProducts = productService.getProducts();
		theModel.addAttribute("products", theProducts);
		return "list-products";
	}
}
