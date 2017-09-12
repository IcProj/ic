package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.MedicalStoreBO;
import com.iamcure.dao.MedicalStoreDAO;

public class MedicalStoreUtil	 {
	
	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, MedicalStoreBO>  userMap=new HashMap<Integer, MedicalStoreBO>();
	
	public static MedicalStoreUtil UserLoginHistoryUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public MedicalStoreUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<MedicalStoreBO> usersList=MedicalStoreDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(MedicalStoreBO user:usersList)
			{
				//put the user record in the map
				userMap.put(Integer.valueOf(user.getU_ID()), user);
			}
		
	}
	
	/**
	 * Singletone method to get teh single tone object
	 * @return
	 */
	public synchronized static MedicalStoreUtil getInstance()
	{
		//if the self reference object is null create the object
		if(UserLoginHistoryUtil==null)
			UserLoginHistoryUtil=new MedicalStoreUtil();
		return UserLoginHistoryUtil;
	}
	
	/**
	 * This method is to get the employee name
	 * if the employee is not exists then returns empty
	 * @param userId
	 * @return
	 */
	public String getuserName(int userId)
	{
		if(userMap.containsKey(userId))
		{
			MedicalStoreBO user=userMap.get(userId);
			return user.getMedicalstoreName();
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(MedicalStoreBO user)
	{
		userMap.put(user.getU_ID(),user);
	}
	
	/**
	 * This method is to delete the employee from the cache
	 * @param userId
	 */
	public void deleteUserFromMap(int userId)
	{
		//if the map contains the user then
		if(userMap.containsKey(userId))
			userMap.remove(userId);//delete the employee from the map
	}
	/**
	 * This method is to get list of all users
	 * @return
	 */
	public List<MedicalStoreBO> getAllUsers()
	{
		List<MedicalStoreBO> userList=new ArrayList<MedicalStoreBO>();
		Set<Integer> ids=userMap.keySet();
		for(Integer id:ids)
		{
			userList.add(userMap.get(id));
		}
		return userList;	
	}
	
	/**
	 * This method is to get the user details
	 * 
	 * @param userId
	 * @return user when exists
	 * returns null when the user details not exists
	 */
	public MedicalStoreBO getUser(int userId)
	{
		if(userMap!=null && userMap.containsKey(Integer.valueOf(userId)))
			return userMap.get(Integer.valueOf(userId));
		else return null;
	}

}
