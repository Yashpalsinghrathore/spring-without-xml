package com.example2;

public class Demo {

	private int i;
	
	private Address address;
	
	

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Demo [i=" + i + ", address=" + address.getCity() + "]";
	}

	
	
}
