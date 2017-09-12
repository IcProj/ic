package com.iamcure.bo.listener;

import java.util.Calendar;

import com.iamcure.bo.DiagnosticCenterBO;
import com.iamcure.dao.DiagnosticCenterDAO;
import com.iamcure.util.DiagnosticCenterUtil;

public class DiagnosticCenterListener {

	public static boolean createOrUpdateDiagnosticCenter(int U_ID, String DiagnosticCenterName, String Country, 
			String StateName, String City, String PinCode, String StreetName, String PhoneNumber, 
			String DiagnosticCenterPhoto, String Descripition, Calendar CreatedDate, Calendar LastModifiedDate, 
			String CreatedBy, String LastModifiedBy, String ContactPerson, String SamplesPickup, 
			String DiagnosticsCenterLicenseNumber, String DiagnosticsCenterLicenseDocument, String IsVerified,
			String operation) {
		
		
		DiagnosticCenterBO DiagnosticCenter = new DiagnosticCenterBO();
		DiagnosticCenter.setU_ID(U_ID);
		DiagnosticCenter.setDiagnosticCenterName(DiagnosticCenterName);
		DiagnosticCenter.setCountry(Country);
		DiagnosticCenter.setStateName(StateName);
		DiagnosticCenter.setCity(City);
		DiagnosticCenter.setPinCode(PinCode );
		DiagnosticCenter.setStreetName(StreetName);
		DiagnosticCenter.setPhoneNumber(PhoneNumber);
		DiagnosticCenter.setDiagnosticCenterPhoto(DiagnosticCenterPhoto);
		DiagnosticCenter.setDescripition(Descripition);
		DiagnosticCenter.setCreatedDate(CreatedDate );
		DiagnosticCenter.setLastModifiedDate(LastModifiedDate );
		DiagnosticCenter.setCreatedBy(CreatedBy);
		DiagnosticCenter.setLastModifiedBy(LastModifiedBy);
		DiagnosticCenter.setContactPerson(ContactPerson);
		DiagnosticCenter.setSamplesPickup(SamplesPickup);
		DiagnosticCenter.setDiagnosticsCenterLicenseNumber(DiagnosticsCenterLicenseNumber);
		DiagnosticCenter.setDiagnosticsCenterLicenseDocument(DiagnosticsCenterLicenseDocument);
		DiagnosticCenter.setIsVerified(IsVerified);
		
		if (operation.equals("create")) {
			
			DiagnosticCenter.setCreatedBy(CreatedBy);
			DiagnosticCenter.setCreatedDate(Calendar.getInstance());

			if (DiagnosticCenterDAO.createDiagnosticCenter(DiagnosticCenter)) {
				DiagnosticCenterUtil.getInstance().constructMap();
				return true;
			}

		} else if (operation.equals("update")) {
			DiagnosticCenter.setLastModifiedBy(LastModifiedBy);
			DiagnosticCenter.setLastModifiedDate(Calendar.getInstance());
			if (DiagnosticCenterDAO.updateDiagnosticCenter(DiagnosticCenter)) {
				DiagnosticCenterUtil.getInstance().constructMap();
				return true;
			}

		}

		return false;
	}


}
