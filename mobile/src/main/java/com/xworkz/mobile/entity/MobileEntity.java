package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="mobile_details")

@NamedQueries( {
    @NamedQuery(name="GET_price_BY_name", query="from MobileEntity m where m.name = :name"),
    @NamedQuery(name="GET_Mobiles", query="from MobileEntity")
})

public class MobileEntity {

//@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="C_ID")
@Id
private int id;
@Column(name="C_NAME")
private String name;
@Column(name="C_VERSION")
private double version;
@Column(name="C_PRICE")
private int price;

public MobileEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public MobileEntity(int id, String name, double version, int price) {
	super();
	this.id = id;
	this.name = name;
	this.version = version;
	this.price = price;
}
	@Override
	public String toString() {
		return "MobileEntity [id=" + id + ", name=" + name + ", version=" + version + ", price=" + price + "]";
	}
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		long temp;
		temp = Double.doubleToLongBits(version);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MobileEntity other = (MobileEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (Double.doubleToLongBits(version) != Double.doubleToLongBits(other.version))
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
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}



