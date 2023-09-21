package vn.edu.pxu.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import vn.edu.pxu.model.Product;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public class ProductDAO {
	private SessionFactory sessionFactory;

	public List<Product> getProducts() {
		Session session = sessionFactory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Product> cq = cb.createQuery(Product.class);
		Root<Product> root = cq.from(Product.class);
		cq.select(root);
		Query query = session.createQuery(cq);
		return query.getResultList();
	}
}
