package com.cg.collections;


//.........overrides hashCode() and equals()
//.....equality set is company, model and operating System


public class CellPhone {
	String company;
	String model;
	String description;
	String operationgSystem;
	int price;
	public CellPhone(String company, String model, String description, String operationgSystem, int price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.operationgSystem = operationgSystem;
		this.price = price;
	}
	@Override
	public String toString() {
		return "CellPhone [company=" + company + ", model=" + model + ", description=" + description
				+ ", operationgSystem=" + operationgSystem + ", price=" + price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
//		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operationgSystem == null) ? 0 : operationgSystem.hashCode());
//		result = prime * result + price;
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
		CellPhone other = (CellPhone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
//		if (description == null) {
//			if (other.description != null)
//				return false;
//		} else if (!description.equals(other.description))
//			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operationgSystem == null) {
			if (other.operationgSystem != null)
				return false;
		} else if (!operationgSystem.equals(other.operationgSystem))
			return false;
//		if (price != other.price)
//			return false;
		return true;
	}
	
	
}
