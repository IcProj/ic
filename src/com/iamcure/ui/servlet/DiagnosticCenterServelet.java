package com.iamcure.ui.servlet;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamcure.bo.listener.DiagnosticCenterListener;
import com.iamcure.util.DateUtil;

/**
 * Servlet implementation class DiagnosticCenterServelet
 */
public class DiagnosticCenterServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DiagnosticCenterServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String U_ID=request.getParameter("U_ID");
		String DiagnosticCenterName=request.getParameter("DiagnosticCenterName");
		String Country=request.getParameter("Country");
		String StateName=request.getParameter("StateName");
		String City=request.getParameter("City");
		String PinCode =request.getParameter("PinCode int");
		String StreetName=request.getParameter("StreetName");
		String PhoneNumber=request.getParameter("PhoneNumber");
		String DiagnosticCenterPhoto=request.getParameter("DiagnosticCenterPhoto");
		String Descripition=request.getParameter("Descripition");
		String CreatedDate =request.getParameter("CreatedDate datetime");
		String LastModifiedDate =request.getParameter("LastModifiedDate datetime");
		String CreatedBy=request.getParameter("CreatedBy");
		String LastModifiedBy=request.getParameter("LastModifiedBy");
		String ContactPerson=request.getParameter("ContactPerson");
		String SamplesPickup=request.getParameter("SamplesPickup");
		String DiagnosticsCenterLicenseNumber=request.getParameter("DiagnosticsCenterLicenseNumber");
		String DiagnosticsCenterLicenseDocument=request.getParameter("DiagnosticsCenterLicenseDocument");
		String IsVerified=request.getParameter("IsVerified");
		String operation=request.getParameter("operation");
		if(StreetName!=null && StreetName.contains("^''''^"))
			StreetName=StreetName.replace("^''''^", "#");
		if(DiagnosticCenterPhoto!=null && DiagnosticCenterPhoto.contains("^''''^"))
			DiagnosticCenterPhoto=DiagnosticCenterPhoto.replace("^''''^", "#");

		
		Calendar 	createddatecal=DateUtil.getCalFromDbFormatString(CreatedDate);
		Calendar 	LastModifiedDatecal=DateUtil.getCalFromDbFormatString(LastModifiedDate);		
		int U_IDint=Integer.valueOf(U_ID);
		
		DiagnosticCenterListener.createOrUpdateDiagnosticCenter( U_IDint, DiagnosticCenterName, Country, StateName, City, 
		PinCode , StreetName, PhoneNumber, DiagnosticCenterPhoto, Descripition, createddatecal , LastModifiedDatecal , CreatedBy,
		LastModifiedBy, ContactPerson, SamplesPickup, DiagnosticsCenterLicenseNumber, DiagnosticsCenterLicenseDocument, 
		IsVerified,operation);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
