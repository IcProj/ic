package com.iamcure.ui.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamcure.bo.listener.MedicalStoreListener;
import com.iamcure.util.DateUtil;

/**
 * Servlet implementation class MedicalStoreServelet
 */
public class MedicalStoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public MedicalStoreServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getParameter("U_ID");
		String MedicalstoreName=request.getParameter("MedicalstoreName");
		String Country=request.getParameter("Country");
		String StateName=request.getParameter("StateName");
		String City=request.getParameter("City");
		String PinCode=request.getParameter("PinCode");
		String StreetName=request.getParameter("StreetName");
		String PhoneNumber=request.getParameter("PhoneNumber");
		String MedicalStorePicture=request.getParameter("MedicalStorePicture");
		String Descripition=request.getParameter("Descripition");
		String DrugLicenseNumber=request.getParameter("DrugLicenseNumber");
		String CreatedDate=request.getParameter("CreatedDate");
		String LastModifiedDate=request.getParameter("LastModifiedDate");
		String CreatedBy=request.getParameter("CreatedBy");
		String LastModifiedBy=request.getParameter("LastModifiedBy");
		String ContactPerson=request.getParameter("ContactPerson");
		String IsVerified=request.getParameter("IsVerified");
		String DrugDelivery=request.getParameter("DrugDelivery");
		String DrugLicenseDocument=request.getParameter("DrugLicenseDocument");
		
		if(StreetName!=null && StreetName.contains("^''''^"))
			StreetName=StreetName.replace("^''''^", "#");
		if(MedicalstoreName!=null && MedicalstoreName.contains("^''''^"))
			MedicalstoreName=MedicalstoreName.replace("^''''^", "#");
		
		Calendar createdDateCal=DateUtil.getCalFromDbFormatString(CreatedDate);
		Calendar LastModifiedDateCal=DateUtil.getCalFromDbFormatString(LastModifiedDate);
		
		MedicalStoreListener.createOrUpdateMedicalStore(MedicalstoreName, Country, StateName, City, PinCode, StreetName, 
				PhoneNumber, MedicalStorePicture, Descripition, DrugLicenseNumber, createdDateCal, LastModifiedDateCal, 
				CreatedBy, LastModifiedBy, ContactPerson, IsVerified, DrugDelivery, DrugLicenseDocument,"");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
