package vn.edu.pxu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.springmvc.crudbasic.entity.Province;

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

	public Product() {
		this.productType = new ProductType();
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	@ManyToOne
	@JoinColumn(name = "id_productTag")
	private ProductTag productTag;

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Integer getSoluong() {
		return soluong;
	}

	public void setSoluong(Integer soluong) {
		this.soluong = soluong;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public ProductTag getProductTag() {
		return productTag;
	}

	public void setProductTag(ProductTag productTag) {
		this.productTag = productTag;
	}

	public Product(int id_product, String product_name, Integer soluong, Float price, ProductType productType,
			ProductTag productTag) {
		super();
		this.id_product = id_product;
		this.product_name = product_name;
		this.soluong = soluong;
		this.price = price;
		this.productType = productType;
		this.productTag = productTag;
	}

}