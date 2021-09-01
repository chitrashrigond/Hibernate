package com.xworkz.camera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="camera_details")
public class CameraEntity {
@Column(name="c_id")
@Id
private int id;
@Column(name="c_brand")
private String brand;
@Column(name="c_version")
private String version;
@Column(name="c_type")
private String Type;
@Column(name="c_pixcel")
private int pixcel;
@Column(name="c_color")
private String color;
@Column(name="c_price")
private int price;
@Column(name="c_bigSize")
private boolean bigSize;
@Column(name="c_shutterSpeed")
private int shutterSpeed;
@Column(name="c_apertures")
private int apertures;


public CameraEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public CameraEntity(int id, String brand, String version, String type, int pixcel, String color, int price,
		boolean bigSize, int shutterSpeed, int apertures) {
	super();
	this.id = id;
	this.brand = brand;
	this.version = version;
	Type = type;
	this.pixcel = pixcel;
	this.color = color;
	this.price = price;
	this.bigSize = bigSize;
	this.shutterSpeed = shutterSpeed;
	this.apertures = apertures;
}
@Override
public String toString() {
	return "CameraEntity [id=" + id + ", brand=" + brand + ", version=" + version + ", Type=" + Type + ", pixcel="
			+ pixcel + ", color=" + color + ", price=" + price + ", bigSize=" + bigSize + ", shutterSpeed="
			+ shutterSpeed + ", apertures=" + apertures + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Type == null) ? 0 : Type.hashCode());
	result = prime * result + apertures;
	result = prime * result + (bigSize ? 1231 : 1237);
	result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	result = prime * result + ((color == null) ? 0 : color.hashCode());
	result = prime * result + id;
	result = prime * result + pixcel;
	result = prime * result + price;
	result = prime * result + shutterSpeed;
	result = prime * result + ((version == null) ? 0 : version.hashCode());
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
	CameraEntity other = (CameraEntity) obj;
	if (Type == null) {
		if (other.Type != null)
			return false;
	} else if (!Type.equals(other.Type))
		return false;
	if (apertures != other.apertures)
		return false;
	if (bigSize != other.bigSize)
		return false;
	if (brand == null) {
		if (other.brand != null)
			return false;
	} else if (!brand.equals(other.brand))
		return false;
	if (color == null) {
		if (other.color != null)
			return false;
	} else if (!color.equals(other.color))
		return false;
	if (id != other.id)
		return false;
	if (pixcel != other.pixcel)
		return false;
	if (price != other.price)
		return false;
	if (shutterSpeed != other.shutterSpeed)
		return false;
	if (version == null) {
		if (other.version != null)
			return false;
	} else if (!version.equals(other.version))
		return false;
	return true;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getVersion() {
	return version;
}
public void setVersion(String version) {
	this.version = version;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public int getPixcel() {
	return pixcel;
}
public void setPixcel(int pixcel) {
	this.pixcel = pixcel;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public boolean isBigSize() {
	return bigSize;
}
public void setBigSize(boolean bigSize) {
	this.bigSize = bigSize;
}
public int getShutterSpeed() {
	return shutterSpeed;
}
public void setShutterSpeed(int shutterSpeed) {
	this.shutterSpeed = shutterSpeed;
}
public int getApertures() {
	return apertures;
}
public void setApertures(int apertures) {
	this.apertures = apertures;
}

}
