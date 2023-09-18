package kr.co.himedia.lambda08;

public class Car {
	private String type;
	private int price;

	public Car() {
		
	}

	public Car(String type) {
		this.type = type;
	}

	public Car(String type, int price) {
		this.type = type;
		this.price = price;
	}

	public String gettype() {
		return type;
	}

	public void settype(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setAge(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.type + ", " + this.price;
	}
}
