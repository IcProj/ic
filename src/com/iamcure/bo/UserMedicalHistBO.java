package com.iamcure.bo;
import java.util.Calendar;
public class UserMedicalHistBO {
	  private int U_ID;
	  private String User_ID;
	  private String Age;
	  private String Weight;   
	  private String Hight; 
	  private String Blood_Group; 
	  private Calendar CreatedDate;   
	  private Calendar ModifiedDate;   
	  private String InsuranceCompany;   
	  private String InsuranceID;
	  private Calendar InsuranceExpaireDate;
	  private String Medication;
	  private String Allergies;
	  private String Healthproblem;
	  
	  
	public String getMedication() {
		return Medication;
	}
	public void setMedication(String medication) {
		Medication = medication;
	}
	public String getAllergies() {
		return Allergies;
	}
	public void setAllergies(String allergies) {
		Allergies = allergies;
	}
	public String getHealthproblem() {
		return Healthproblem;
	}
	public void setHealthproblem(String healthproblem) {
		Healthproblem = healthproblem;
	}
	public int getU_ID() {
		return U_ID;
	}
	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}
	public String getUser_ID() {
		return User_ID;
	}
	public void setUser_ID(String user_ID) {
		User_ID = user_ID;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public String getHight() {
		return Hight;
	}
	public void setHight(String hight) {
		Hight = hight;
	}
	public String getBlood_Group() {
		return Blood_Group;
	}
	public void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}
	public Calendar getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(Calendar createdDate) {
		CreatedDate = createdDate;
	}
	public Calendar getModifiedDate() {
		return ModifiedDate;
	}
	public void setModifiedDate(Calendar modifiedDate) {
		ModifiedDate = modifiedDate;
	}
	public String getInsuranceCompany() {
		return InsuranceCompany;
	}
	public void setInsuranceCompany(String insuranceCompany) {
		InsuranceCompany = insuranceCompany;
	}
	public String getInsuranceID() {
		return InsuranceID;
	}
	public void setInsuranceID(String insuranceID) {
		InsuranceID = insuranceID;
	}
	public Calendar getInsuranceExpaireDate() {
		return InsuranceExpaireDate;
	}
	public void setInsuranceExpaireDate(Calendar insuranceExpaireDate) {
		InsuranceExpaireDate = insuranceExpaireDate;
	}

}
