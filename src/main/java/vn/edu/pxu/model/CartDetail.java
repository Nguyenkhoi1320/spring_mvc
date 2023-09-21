package vn.edu.pxu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CartDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cartdetail")
	private int id_cartdetail;

	@Column(name = "soluong")
	private int soluong;

	@Column(name = "price")
	private int price;

	@ManyToOne
	@JoinColumn(name = "id_product")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "id_cart")
	private Cart cart;
}