package com.iamcure.dao;


import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.UserRandomBO;
import com.iamcure.util.HibernateUtil;
import com.sun.istack.internal.logging.Logger;

public class UserRandomDAO {
private static Log log=LogFactory.getLog(UserRandomBO.class);
	
	/**
	 * This method to create the user
	 * @param user
	 * @return
	 */
	public static boolean createuser(UserRandomBO user) {
		return CommonDAO.createRecord(user);
	}

	/**
	 * This method is to update the user
	 * @param user
	 * @return
	 */
	public static boolean updateuser(UserRandomBO user) {
		return CommonDAO.updateRecord(user);
	}
	
	/**
	 * This method to to delete the user
	 * @param userId
	 * @return
	 */
	public static boolean deleteuser(int userId)
	{
		UserRandomBO user = new UserRandomBO();
		return CommonDAO.deleteRecord(userId,user);
	}
	
	/**
	 * This method is to get the list of all users
	 * @return
	 */
	public static List<UserRandomBO> getAllUsers()
	{
		String query = "from UserRandomBO";
		List<UserRandomBO> userList=null;
		userList = (List<UserRandomBO>)CommonDAO.executeHibernateQuery(query);
		return userList;	
	}
	
	/**
	 * This method to get the user datails
	 * @param userId
	 * @return
	 */
	public static UserRandomBO getuser(int userId)
	{
		UserRandomBO user=null;
		try
		{
			user=(UserRandomBO) CommonDAO.getRecordBasedOnPrimaryKey(userId, new UserRandomBO());
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
