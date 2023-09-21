package vn.edu.pxu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productTag")
public class ProductTag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_productTag")
	private int id_productTag;
	
	@Column(name = "nameTag")
	private String nameTag;
}