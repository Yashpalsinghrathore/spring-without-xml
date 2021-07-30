package com.exmple1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {

	@Value("12")
	int i;
	@Value("#{12*12}")
	int j;
	public int getI() {
		return i;
	}
	@Override
	public String toString() {
		return "Demo [i=" + i + ", j=" + j + "]";
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
}
