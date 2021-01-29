package com.nucleus;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department
{
	@Id
    private int amount;
    private int roi;
    private int year;
    
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRoi() {
		return roi;
	}
	public void setRoi(int roi) {
		this.roi = roi;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "Department [amount=" + amount + ", roi=" + roi + ", year=" + year + "]";
	}
	
	
    
	
    
}
