package com.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class Patient {

	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String P_Name;
	private String P_Dept;
	private String P_Diagnose;
	private int  P_Free;
	public Patient(int id, String p_Name, String p_Dept, String p_Diagnose, int p_Free) {
		super();
		Id = id;
		P_Name = p_Name;
		P_Dept = p_Dept;
		P_Diagnose = p_Diagnose;
		P_Free = p_Free;
	}
	public Patient(String p_Name, String p_Dept, String p_Diagnose, int p_Free) {
		super();
		P_Name = p_Name;
		P_Dept = p_Dept;
		P_Diagnose = p_Diagnose;
		P_Free = p_Free;
	}
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getP_Name() {
		return P_Name;
	}
	public void setP_Name(String p_Name) {
		P_Name = p_Name;
	}
	public String getP_Dept() {
		return P_Dept;
	}
	public void setP_Dept(String p_Dept) {
		P_Dept = p_Dept;
	}
	public String getP_Diagnose() {
		return P_Diagnose;
	}
	public void setP_Diagnose(String p_Diagnose) {
		P_Diagnose = p_Diagnose;
	}
	public int getP_Free() {
		return P_Free;
	}
	public void setP_Free(int p_Free) {
		P_Free = p_Free;
	}
	@Override
	public String toString() {
		return "Paitent [Id=" + Id + ", P_Name=" + P_Name + ", P_Dept=" + P_Dept + ", P_Diagnose=" + P_Diagnose
				+ ", P_Free=" + P_Free + "]";
	}

	
	
}
