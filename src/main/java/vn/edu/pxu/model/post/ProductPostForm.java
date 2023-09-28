package vn.edu.pxu.model.post;

public class ProductPostForm {
	public ProductPostForm() {
		// TODO Auto-generated constructor stub
	}

	private int id_product;
	private String product_name;
	private Integer soluong;
	private Float price;
	private int ProductType;

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

	public int getProductType() {
		return ProductType;
	}

	public void setProductType(int productType) {
		ProductType = productType;
	}

}
