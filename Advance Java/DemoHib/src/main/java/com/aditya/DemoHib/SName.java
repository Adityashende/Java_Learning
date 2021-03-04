package com.aditya.DemoHib;

import javax.persistence.Embeddable;

@Embeddable
public class SName {
	
	private String FName;
	private String MName;
	private String LName;
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getMName() {
		return MName;
	}
	public void setMName(String mName) {
		MName = mName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	@Override
	public String toString() {
		return "SName [FName=" + FName + ", MName=" + MName + ", LName=" + LName + "]";
	}
	
	

}
