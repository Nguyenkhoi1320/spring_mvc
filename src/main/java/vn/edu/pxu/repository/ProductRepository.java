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

import vn.edu.pxu.model.Product;

@Repository
@Transactional
public class ProductRepository implements BaseRepository<Product> {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Product> getAll() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void save(Product object) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(object);

	}

	@Override
	public Product getById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Product theProduct = currentSession.get(Product.class, id);
		return theProduct;
	}

	@Override
	public void deleteById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product book = session.byId(Product.class).load(id);
		session.delete(book);
	}

}
