package com.ems;

public final class ContractEmployee extends Employee{
       private double contractAmount;
	public ContractEmployee(int empId,String empName,Department department ,
			Address address,double contractAmount) {
		// TODO Auto-generated constructor stub
		super(empId, empName, department, address);
		this.contractAmount = contractAmount;
	}
	@Override
	public double calcSalary() {
	    return contractAmount;
	}
}