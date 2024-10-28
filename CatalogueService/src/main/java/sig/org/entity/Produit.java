package sig.org.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit implements Serializable {


	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String designation;
	private double price;
	private int quantity;
	
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Produit(String designation, double price, int quantity) {
		super();
		this.designation = designation;
		this.price = price;
		this.quantity = quantity;
	}

	public Produit(Long id, String designation, double price, int quantity) {
		super();
		this.id = id;
		this.designation = designation;
		this.price = price;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
	
	
	
	
	

}
