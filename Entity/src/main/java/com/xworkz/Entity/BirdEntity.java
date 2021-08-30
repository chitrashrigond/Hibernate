package com.xworkz.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="birddetails_Table")
public class BirdEntity{
    @Column(name="C_ID")
    @Id
	private int id;
    @Column(name="C_Name")
    private String name;
    @Column(name="C_Color")
    private String color;
    @Column(name="C_BigeSize")
    private boolean bigeSize;
    @Column(name="C_NoOfLeg")
    private int noOfLeg;
    @Column(name="C_MoreWeight")
    private boolean moreWeight;
    @Column(name="C_Attractive")
    private boolean attractive;
    @Column(name="C_ScientificName")
    private String scientificName;
    @Column(name="C_Lifespan")
    private int lifespan;
    @Column(name="C_CanFly")
    private boolean canFly;
    
	public BirdEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BirdEntity(int id, String name, String color, boolean bigeSize, int noOfLeg, boolean moreWeight,
			boolean attractive, String scientificName, int lifespan, boolean canFly) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.bigeSize = bigeSize;
		this.noOfLeg = noOfLeg;
		this.moreWeight = moreWeight;
		this.attractive = attractive;
		this.scientificName = scientificName;
		this.lifespan = lifespan;
		this.canFly = canFly;
	}
    
	  @Override
		public String toString() {
			return "BirdEntity [id=" + id + ", name=" + name + ", color=" + color + ", BigeSize=" + bigeSize + ", noOfLeg="
					+ noOfLeg + ", moreWeight=" + moreWeight + ", attractive=" + attractive + ", scientificName="
					+ scientificName + ", Lifespan=" + lifespan + ", canFly=" + canFly + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (bigeSize ? 1231 : 1237);
			result = prime * result + lifespan;
			result = prime * result + (attractive ? 1231 : 1237);
			result = prime * result + (canFly ? 1231 : 1237);
			result = prime * result + ((color == null) ? 0 : color.hashCode());
			result = prime * result + id;
			result = prime * result + (moreWeight ? 1231 : 1237);
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + noOfLeg;
			result = prime * result + ((scientificName == null) ? 0 : scientificName.hashCode());
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
			BirdEntity other = (BirdEntity) obj;
			if (bigeSize != other.bigeSize)
				return false;
			if (lifespan != other.lifespan)
				return false;
			if (attractive != other.attractive)
				return false;
			if (canFly != other.canFly)
				return false;
			if (color == null) {
				if (other.color != null)
					return false;
			} else if (!color.equals(other.color))
				return false;
			if (id != other.id)
				return false;
			if (moreWeight != other.moreWeight)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (noOfLeg != other.noOfLeg)
				return false;
			if (scientificName == null) {
				if (other.scientificName != null)
					return false;
			} else if (!scientificName.equals(other.scientificName))
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
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isBigeSize() {
			return bigeSize;
		}
		public void setBigeSize(boolean bigeSize) {
			bigeSize = bigeSize;
		}
		public int getNoOfLeg() {
			return noOfLeg;
		}
		public void setNoOfLeg(int noOfLeg) {
			this.noOfLeg = noOfLeg;
		}
		public boolean isMoreWeight() {
			return moreWeight;
		}
		public void setMoreWeight(boolean moreWeight) {
			this.moreWeight = moreWeight;
		}
		public boolean isAttractive() {
			return attractive;
		}
		public void setAttractive(boolean attractive) {
			this.attractive = attractive;
		}
		public String getScientificName() {
			return scientificName;
		}
		public void setScientificName(String scientificName) {
			this.scientificName = scientificName;
		}
		public int getLifespan() {
			return lifespan;
		}
		public void setLifespan(int lifespan) {
			lifespan = lifespan;
		}
		public boolean isCanFly() {
			return canFly;
		}
		public void setCanFly(boolean canFly) {
			this.canFly = canFly;
		}
}
