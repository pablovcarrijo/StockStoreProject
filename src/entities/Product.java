package entities;

import java.util.Objects;

public class Product {

	private String name;
	private Integer code;
	private Integer quantity;
	private Double pricePerUnit;
	
	public Product(String name, Integer code, Integer quantity, Double pricePerUnit) {
		this.name = name;
		this.code = code;
		this.quantity = quantity;
		this.pricePerUnit = pricePerUnit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(code, other.code);
	}
	
	
	@Override
	public String toString() {
		return "- Code: " + getCode() + "; Name: " + getName() + "; Quantity: " + getQuantity()
		+ "; Price per unit: R$" + String.format("%.2f", getPricePerUnit());
	}
	
}
