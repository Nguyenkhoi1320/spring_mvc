package vn.edu.pxu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderDetail")
public class OrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_orderdetail")
	private int id_orderdetail;

	@Column(name = "soluong")
	private int soluong;

	@Column(name = "price")
	private int price;

	@ManyToOne
	@JoinColumn(name = "id_product")
	private Product product;

	@ManyToOne
	@JoinColumn(name = "id_order")
	private Order order;
}