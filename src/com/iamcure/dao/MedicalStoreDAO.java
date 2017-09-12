package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.MedicalStoreBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;


public class MedicalStoreDAO {
	
private static Log log=LogFactory.getLog(MedicalStoreDAO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(MedicalStoreBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(MedicalStoreBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		MedicalStoreBO user = new MedicalStoreBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<MedicalStoreBO> getAllUsers()
	{
		String query = "from MedicalStoreBO";
		List<MedicalStoreBO> userList=null;
		userList = (List<MedicalStoreBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static MedicalStoreBO getuser(int userId)
	{
		MedicalStoreBO user=null;
		try
		{
			user=(MedicalStoreBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new MedicalStoreBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return user;
	}
	public static void main(String asd[])
	{
		
	}

}
