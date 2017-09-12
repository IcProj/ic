package com.iamcure.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.iamcure.bo.UserProfileBO;
import com.iamcure.dao.UserProfileDAO;

public class UserProfileUtil {
	
	/**
	 * static map used to cache the user information
	 */
	public static Map<Integer, UserProfileBO>  userprofileMap=new HashMap<Integer, UserProfileBO>();
	
	public static UserProfileUtil UserProfileUtil=null;
	
	/**
	 * Constructor to create the to initialise the map
	 */
	public UserProfileUtil()
	{
		constructMap();
	}
	
	/**
	 * to construct the map for the first time
	 */
	public void constructMap() {
		//get all the list of usersList 
		List<UserProfileBO> usersList=UserProfileDAO.getAllUsers();
		if(usersList!=null && usersList.size()>0)
			//for every user in the list
			for(UserProfileBO userprofile:usersList)
			{
				//put the user record in the map
				userprofileMap.put(userprofile.getU_ID(), userprofile);
			}
		
	}
	
	/**
	 * Singletone method to get teh single tone object
	 * @return
	 */
	public synchronized static UserProfileUtil getInstance()
	{
		//if the self reference object is null create the object
		if(UserProfileUtil==null)
			UserProfileUtil=new UserProfileUtil();
		return UserProfileUtil;
	}
	
	/**
	 * This method is to get the employee name
	 * if the employee is not exists then returns empty
	 * @param userId
	 * @return
	 */
	public String getuserName(int userId)
	{
		if(userprofileMap.containsKey(userId))
		{
			UserProfileBO user=userprofileMap.get(userId);
			return user.getUser_id();// instead of fullName Called User_ID
		}
		else 
			return "";
	}
	
	/**
	 * This method is to update the cache whenever a change is occured
	 * @param emp
	 */
	public void updateUserMap(UserProfileBO user)
	{
		userprofileMap.put(user.getU_ID(),user);
	}
	
	/**
	 * This method is to delete the employee from the cache
	 * @param userId
	 */
	public void deleteUserFromMap(int userId)
	{
		//if the map contains the user then
		if(userprofileMap.containsKey(userId))
			userprofileMap.remove(userId);//delete the employee from the map
	}
	/**
	 * This method is to get list of all users
	 * @return
	 */
	public List<UserProfileBO> getAllUsers()
	{
		List<UserProfileBO> userList=new ArrayList<UserProfileBO>();
		Set<Integer> ids=userprofileMap.keySet();
		for(Integer id:ids)
		{
			userList.add(userprofileMap.get(id));
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
	public UserProfileBO getUser(int userId)
	{
		if(userprofileMap!=null && userprofileMap.containsKey(Integer.valueOf(userId)))
			return userprofileMap.get(Integer.valueOf(userId));
		else return null;
	}
	
	public List<UserProfileBO> getUsers(String empName)
	{
		List<UserProfileBO> userList=new ArrayList<UserProfileBO>();
		Set<Integer> ids=userprofileMap.keySet();
		for(Integer id:ids)
		{
			UserProfileBO user=userprofileMap.get(id);
			String userName=user.getUser_id();// instead of fullName Called User_ID
			if(userName!=null && userName.contains(empName))
				userList.add(user);
		}

		return userList;
	}
	

}
