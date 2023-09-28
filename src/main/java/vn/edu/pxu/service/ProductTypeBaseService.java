package vn.edu.pxu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.edu.pxu.model.ProductType;
import vn.edu.pxu.repository.BaseRepository;


@Service
public class ProductTypeBaseService implements BaseService<ProductType> {
    
    @Autowired
    private BaseRepository<ProductType> productTypeRepository;

    public ProductTypeBaseService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<ProductType> getAll() {
        // TODO Auto-generated method stub
        return productTypeRepository.getAll();
    }

    @Override
    public void save(ProductType object) {
        // TODO Auto-generated method stub
    	productTypeRepository.save(object);
    }

    @Override
    public ProductType get(int id) {
        // TODO Auto-generated method stub
        return productTypeRepository.getById(id);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
    	productTypeRepository.deleteById(id);
    }
    
    

}
