package com.xworkz.dryFruit.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="drifruit_details")
public class DryFruitDTO {
	@Column(name="C_ID")
	@Id
	private int id;
	@Column(name="C_NAME")
	private String name;
	@Column(name="C_PRICE")
	private int price; 
	@Column(name="C_TASTE")
	private boolean taste;
	@Column(name="C_BENIFIT")
	private String benifits;
	@Column(name="C_COLOR")
	private String color;
	
	public DryFruitDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DryFruitDTO(int id, String name, int price, boolean taste, String benifits, String color) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.taste = taste;
		this.benifits = benifits;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "DryFruitDTO [id=" + id + ", name=" + name + ", price=" + price + ", taste=" + taste + ", benifits="
				+ benifits + ", color=" + color + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((benifits == null) ? 0 : benifits.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + (taste ? 1231 : 1237);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DryFruitDTO other = (DryFruitDTO) obj;
		if (benifits == null) {
			if (other.benifits != null)
				return false;
		} else if (!benifits.equals(other.benifits))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (taste != other.taste)
			return false;
		return true;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isTaste() {
		return taste;
	}
	public void setTaste(boolean taste) {
		this.taste = taste;
	}
	public String getBenifits() {
		return benifits;
	}
	public void setBenifits(String benifits) {
		this.benifits = benifits;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
