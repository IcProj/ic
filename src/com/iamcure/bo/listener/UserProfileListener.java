package com.iamcure.bo.listener;

import java.util.Calendar;

import com.iamcure.bo.UserProfileBO;
import com.iamcure.dao.UserProfileDAO;
import com.iamcure.util.UserProfileUtil;

public class UserProfileListener {
	
	
	public static boolean createOrUpdateUserProfile(String userId,
			String firstName, String lastName, String imagePath,
			String relation, Calendar dob, String adharCard, String country,
			String state, String city, String pincode, String address1,
			String address2, String phoneNumber, String emailId,
			String emergencyContact, String createdBy, String modifiledBy,
			String operation) {
		
		
		UserProfileBO userProfile = new UserProfileBO();
		userProfile.setUser_id(userId);
		userProfile.setFirst_Name(firstName);
		userProfile.setLast_Name(lastName);
		userProfile.setImage(imagePath);
		userProfile.setReleation(relation);
		userProfile.setDate_Of_Birth(dob);
		userProfile.setAdharCard_Number(adharCard);
		userProfile.setCountry(country);
		userProfile.setState(state);
		userProfile.setCity(city);
		userProfile.setPincode(pincode);
		userProfile.setAddress1(address1);
		userProfile.setAddress2(address2);
		userProfile.setPhone_Number(phoneNumber);
		userProfile.setE_Mail_ID(emailId);
		userProfile.setEmergenc_Contact(emergencyContact);

		if (operation.equals("create")) {
			
			userProfile.setCreatedBy(createdBy);
			userProfile.setCreatedDate(Calendar.getInstance());

			if (UserProfileDAO.createuser(userProfile)) {
				UserProfileUtil.getInstance().constructMap();
				return true;
			}

		} else if (operation.equals("update")) {
			userProfile.setLastModifiedBy(modifiledBy);
			userProfile.setLastModified_Date(Calendar.getInstance());
			if (UserProfileDAO.updateuser(userProfile)) {
				UserProfileUtil.getInstance().constructMap();
				return true;
			}

		}

		return false;
	}

}
