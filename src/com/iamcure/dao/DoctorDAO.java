package com.iamcure.dao;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.DoctorBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;
public class DoctorDAO {

private static Log log=LogFactory.getLog(UserDAO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(DoctorBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(DoctorBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		DoctorBO user = new DoctorBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<DoctorBO> getAllUsers()
	{
		String query = "from DoctorBO";
		List<DoctorBO> userList=null;
		userList = (List<DoctorBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static DoctorBO getuser(int userId)
	{
		DoctorBO user=null;
		try
		{
			user=(DoctorBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new DoctorBO());
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
