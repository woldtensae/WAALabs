package mum.edu.domain;

import java.io.Serializable;

public class Calculator implements  Serializable{

	private static final long serialVersionUID = 1L;
	private double num1;
	private double num2;
	private String operator;
	private double result;
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	
	
	
}
