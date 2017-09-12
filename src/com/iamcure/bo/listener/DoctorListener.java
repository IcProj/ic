package com.iamcure.bo.listener;

import java.util.Calendar;

import com.iamcure.bo.DoctorBO;
import com.iamcure.dao.DoctorDAO;
import com.iamcure.util.DoctorUtil;

public class DoctorListener {

	@SuppressWarnings("null")
	public static boolean createDoctor(int id, String fullName, Boolean isDoctor , String qualification, 
		String College, String CompletionYear, String Specilizations, String specialized, String CouncilRegistrationNumber, 
		String CouncilName, String CouncilYear, String CertificatePath, String IDProofPath, 
		Boolean isMedicalRegistrationverify , String Description, String Experince, String City, String DoctorImagePath, 
		String EmailID, String PersonalContact, String BusinessContact, Calendar Createdate, String CreatedBy,
		Calendar LastmodifiedDate, String LastmodifedBy){
		DoctorBO Doctor=new DoctorBO();
		Doctor.setId(id);
		Doctor.setFullName(fullName);
		Doctor.setIsDoctor(isDoctor );
		Doctor.setQualification(qualification);
		Doctor.setCollege(College);
		Doctor.setCompletionYear(CompletionYear);
		Doctor.setSpecilizations(Specilizations);
		Doctor.setSpecialized(specialized);
		Doctor.setCouncilRegistrationNumber(CouncilRegistrationNumber);
		Doctor.setCouncilName(CouncilName);
		Doctor.setCouncilYear(CouncilYear);
		Doctor.setCertificatePath(CertificatePath);
		Doctor.setIDProofPath(IDProofPath);
		Doctor.setIsMedicalRegistrationverify(isMedicalRegistrationverify );
		Doctor.setDescription(Description);
		Doctor.setExperince(Experince);
		Doctor.setCity(City);
		Doctor.setDoctorImagePath(DoctorImagePath);
		Doctor.setEmailID(EmailID);
		Doctor.setPersonalContact(PersonalContact);
		Doctor.setBusinessContact(BusinessContact);
		Doctor.setCreatedate(Createdate);//Calendar createdDate=Calendar.getInstance();
		Doctor.setCreatedBy(CreatedBy);
		Doctor.setLastmodifiedDate(LastmodifiedDate);
		Doctor.setLastmodifedBy(LastmodifedBy);
		Object operation = null;
		if (operation.equals("create")) {
			
			Doctor.setCreatedate(Createdate);
			Doctor.setCreatedate(Calendar.getInstance());

			if (DoctorDAO.createuser(Doctor)) {
				DoctorUtil.getInstance().constructMap();
				return true;
			}

		} else if (operation.equals("update")) {
			Doctor.setLastmodifedBy(LastmodifedBy);
			Doctor.setLastmodifiedDate(Calendar.getInstance());
			if (DoctorDAO.updateuser(Doctor)) {
				DoctorUtil.getInstance().constructMap();
				return true;
			}

		}

		return false;
	}

	public static void createOrUpdateDoctor(String id, String fullName,
			String isDoctor, String qualification, String college,
			String completionYear, String specilizations, String specialized,
			String councilRegistrationNumber, String councilName,
			String councilYear, String certificatePath, String iDProofPath,
			String isMedicalRegistrationverify, String description,
			String experince, String city, String doctorImagePath,
			String emailID, String personalContact, String businessContact,
			String createdate, String createdBy, String lastmodifiedDate,
			String lastmodifedBy) {
		// TODO Auto-generated method stub
		
	}

}
