package vn.edu.pxu.repository;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import vn.edu.pxu.model.ProductType;

@Repository
@Transactional
public class ProductTypeRepository implements BaseRepository<ProductType> {

    @Autowired
    private SessionFactory sessionFactory;
    
    public ProductTypeRepository() {
        
    }

    @Override
    public List<ProductType> getAll() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery < ProductType > cq = cb.createQuery(ProductType.class);
        Root < ProductType > root = cq.from(ProductType.class);
        cq.select(root);
        Query query = session.createQuery(cq);
        return query.getResultList();
    }

    @Override
    public void save(ProductType object) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(object);
        
    }

    @Override
    public ProductType getById(int id) {
        Session currentSession = sessionFactory.getCurrentSession();
        ProductType ProductType = currentSession.get(ProductType.class, id);
        return ProductType;
    }

    @Override
    public void deleteById(int id) {
        // TODO Auto-generated method stub
        Session session = sessionFactory.getCurrentSession();
        ProductType object = session.byId(ProductType.class).load(id);
        session.delete(object);
    }

}
