package com.iamcure.ui.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iamcure.bo.listener.DoctorListener;
import com.iamcure.util.DoctorUtil;

/**
 * Servlet implementation class DoctorServlet
 */
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String fullName =request.getParameter("fullName");
		String isDoctor	=request.getParameter("isDoctor");
		String qualification =request.getParameter("qualification");
		String College =request.getParameter("college");
		String CompletionYear =request.getParameter("completionYear");
		String Specilizations =request.getParameter("cpecilizations");
		String specialized =request.getParameter("specialized");
		String CouncilRegistrationNumber =request.getParameter("councilRegistrationNumber");
		String CouncilName =request.getParameter("councilName");
		String CouncilYear =request.getParameter("councilYear");
		String CertificatePath =request.getParameter("certificatePath");
		String IDProofPath =request.getParameter("iDProofPath");
		String isMedicalRegistrationverify =request.getParameter("isMedicalRegistrationverify");
		String Description =request.getParameter("description");
		String Experince =request.getParameter("experince");
		String City =request.getParameter("city");
		String DoctorImagePath =request.getParameter("doctorImagePath");
		String EmailID =request.getParameter("emailID");
		String PersonalContact =request.getParameter("personalContact");
		String BusinessContact =request.getParameter("businessContact");
		String Createdate =request.getParameter("createdate");
		String CreatedBy =request.getParameter("createdBy");
		String LastmodifiedDate =request.getParameter("lastmodifiedDate");
		String LastmodifedBy =request.getParameter("lastmodifedBy");
		if(DoctorImagePath!=null && DoctorImagePath.contains("^''''^"))
			DoctorImagePath=DoctorImagePath.replace("^''''^", "#");
		if(IDProofPath!=null && IDProofPath.contains("^''''^"))
			IDProofPath=IDProofPath.replace("^''''^", "#");
		
		DoctorUtil.getCalFromDbFormatString(Createdate);
	
		DoctorListener.createOrUpdateDoctor(id, fullName, isDoctor , qualification, College, CompletionYear, Specilizations, 
				specialized, CouncilRegistrationNumber, CouncilName, CouncilYear, CertificatePath, IDProofPath, 
				isMedicalRegistrationverify , Description, Experince, City, DoctorImagePath, 
				EmailID, PersonalContact, BusinessContact,  Createdate, CreatedBy, LastmodifiedDate, LastmodifedBy);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
