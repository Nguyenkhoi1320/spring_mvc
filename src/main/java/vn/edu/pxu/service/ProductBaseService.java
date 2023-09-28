package vn.edu.pxu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.pxu.model.Product;
import vn.edu.pxu.repository.BaseRepository;



@Service
public class ProductBaseService implements BaseService<Product> {

    
    @Autowired
    private BaseRepository<Product> productRepository;
    
    
    public ProductBaseService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Product> getAll() {
        // TODO Auto-generated method stub
        return productRepository.getAll();
    }

    @Override
	public void save(Product object) {
        // TODO Auto-generated method stub
    	productRepository.save(object);
    }

    @Override
    public Product get(int id) {
        // TODO Auto-generated method stub
        return productRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
    	productRepository.deleteById(id);
    }

   
}
