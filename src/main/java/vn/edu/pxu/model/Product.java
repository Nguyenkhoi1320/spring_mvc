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
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product")
	private int id_product;

	@Column(name = "product_name")
	private String product_name;

	@Column(name = "soluong")
	private Integer soluong;

	@Column(name = "price")
	private Float price;

	@ManyToOne
	@JoinColumn(name = "id_productType")
	private ProductType productType;

	@ManyToOne
	@JoinColumn(name = "id_productTag")
	private ProductTag productTag;

}