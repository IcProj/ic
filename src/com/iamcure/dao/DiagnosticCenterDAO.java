package com.iamcure.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iamcure.bo.DiagnosticCenterBO;
import com.iamcure.util.HibernateUtil;

public class DiagnosticCenterDAO {
	
private static Log log=LogFactory.getLog(DiagnosticCenterDAO.class);
	
	/**
	 * This method to create the DiagnosticCenter
	 * @param DiagnosticCenter
	 * @return
	 */
	public static boolean createDiagnosticCenter(DiagnosticCenterBO DiagnosticCenter) {
		return CommonDAO.createRecord(DiagnosticCenter);
	}

	/**
	 * This method is to update the DiagnosticCenter
	 * @param DiagnosticCenter
	 * @return
	 */
	public static boolean updateDiagnosticCenter(DiagnosticCenterBO DiagnosticCenter) {
		return CommonDAO.updateRecord(DiagnosticCenter);
	}
	
	/**
	 * This method to to delete the DiagnosticCenter
	 * @param DiagnosticCenterId
	 * @return
	 */
	public static boolean deleteDiagnosticCenter(int DiagnosticCenterId)
	{
		DiagnosticCenterBO DiagnosticCenter = new DiagnosticCenterBO();
		return CommonDAO.deleteRecord(DiagnosticCenterId,DiagnosticCenter);
	}
	
	/**
	 * This method is to get the list of all DiagnosticCenters
	 * @return
	 */
	public static List<DiagnosticCenterBO> getAllDiagnosticCenters()
	{
		String query = "from DiagnosticCenterBO";
		List<DiagnosticCenterBO> DiagnosticCenterList=null;
		DiagnosticCenterList = (List<DiagnosticCenterBO>)CommonDAO.executeHibernateQuery(query);
		return DiagnosticCenterList;	
	}
	
	/**
	 * This method to get the DiagnosticCenter datails
	 * @param DiagnosticCenterId
	 * @return
	 */
	public static DiagnosticCenterBO getDiagnosticCenter(int DiagnosticCenterId)
	{
		DiagnosticCenterBO DiagnosticCenter=null;
		try
		{
			DiagnosticCenter=(DiagnosticCenterBO) CommonDAO.getRecordBasedOnPrimaryKey(DiagnosticCenterId, new DiagnosticCenterBO());
		}
		catch (Exception e) {
			
		}
		finally{
			HibernateUtil.closeSession();
		}
		return DiagnosticCenter;
	}
	public static void main(String asd[])
	{
		
	}



}
