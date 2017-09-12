package com.iamcure.bo.listener;

import java.util.Calendar;
import com.iamcure.bo.MedicalStoreBO;
import com.iamcure.dao.MedicalStoreDAO;
import com.iamcure.util.DateUtil;
import com.iamcure.util.MedicalStoreUtil;


public class MedicalStoreListener {
	
	public static boolean createOrUpdateMedicalStore(String MedicalstoreName, String Country, String StateName,
			String City, String PinCode, String StreetName, String PhoneNumber, String MedicalStorePicture, String Descripition, 
			String DrugLicenseNumber, Calendar CreatedDate, Calendar LastModifiedDate, String CreatedBy, String LastModifiedBy,
			String ContactPerson, String IsVerified, String DrugDelivery, String DrugLicenseDocument , String operation) 
	{

		MedicalStoreBO MedicalStore = new MedicalStoreBO();
		MedicalStore.setMedicalstoreName(MedicalstoreName);
		MedicalStore.setCountry(Country);
		MedicalStore.setStateName(StateName);
		MedicalStore.setCity(City);
		MedicalStore.setPinCode(PinCode);
		MedicalStore.setStreetName(StreetName);
		MedicalStore.setPhoneNumber(PhoneNumber);
		MedicalStore.setMedicalStorePicture(MedicalStorePicture);
		MedicalStore.setDescripition(Descripition);
		MedicalStore.setDrugLicenseNumber(DrugLicenseNumber);
		MedicalStore.setCreatedDate(CreatedDate);
		MedicalStore.setLastModifiedDate(LastModifiedDate);
		MedicalStore.setCreatedBy(CreatedBy);
		MedicalStore.setLastModifiedBy(LastModifiedBy);
		MedicalStore.setContactPerson(ContactPerson);
		MedicalStore.setIsVerified(IsVerified);
		MedicalStore.setDrugDelivery(DrugDelivery);
		MedicalStore.setDrugLicenseDocument(DrugLicenseDocument);
		
		
		if (operation.equals("create")) {
			
			MedicalStore.setCreatedBy(CreatedBy);
			MedicalStore.setCreatedDate(Calendar.getInstance());

			if (MedicalStoreDAO.createuser(MedicalStore)) {
				MedicalStoreUtil.getInstance().constructMap();
				return true;
			}

		} else if (operation.equals("update")) {
			MedicalStore.setLastModifiedBy(LastModifiedBy);
			MedicalStore.setLastModifiedDate(Calendar.getInstance());
			if (MedicalStoreDAO.updateuser(MedicalStore)) {
				MedicalStoreUtil.getInstance().constructMap();
				return true;
			}

		}

		return false;
	
		// TODO Auto-generated method stub
		
	}
	

		
}
