function submitToParent(){
	
		var fullName=document.getElementById("fullName").value;
		var isDoctor=document.getElementById("isDoctor").value;
		var qualification=document.getElementById("qualification").value;
		var College=document.getElementById("College").value;
		var CompletionYear=document.getElementById("CompletionYear").value;
		var Specilizations=document.getElementById("Specilizations").value;
		var specialized=document.getElementById("specialized").value;
		var CouncilRegistrationNumber=document.getElementById("CouncilRegistrationNumber").value;
		var CouncilName=document.getElementById("CouncilName").value;
		var CouncilYear=document.getElementById("CouncilYear").value;
		var CertificatePath=document.getElementById("CertificatePath").value;
		var IDProofPath=document.getElementById("IDProofPath").value;
		var isMedicalRegistrationverify=document.getElementById("isMedicalRegistrationverify").value;
		var Description=document.getElementById("Description").value;
		var Experince=document.getElementById("Experince").value;
		var City=document.getElementById("City").value;
		var DoctorImagePath=document.getElementById("DoctorImagePath").value;
		var EmailID=document.getElementById("EmailID").value;
		var PersonalContact=document.getElementById("PersonalContact").value;
		var BusinessContact=document.getElementById("BusinessContact").value;
		
	
	if(validateform())
	{
           addDoctorProfileProfile(fullName, isDoctor, qualification, College, CompletionYear, Specilizations, specialized, CouncilRegistrationNumber, CouncilName, CouncilYear, CertificatePath, IDProofPath, isMedicalRegistrationverify, Description, Experince, City, DoctorImagePath, EmailID, PersonalContact, BusinessContact);
	}else 
		return false;
	
}

function addDoctorProfileProfile(fullName, isDoctor, qualification, College, CompletionYear, Specilizations, specialized, CouncilRegistrationNumber, CouncilName, CouncilYear, CertificatePath, IDProofPath, isMedicalRegistrationverify, Description, Experince, City, DoctorImagePath, EmailID, PersonalContact, BusinessContact);
{
	document.location.href = "DoctorServlet?action=Submint&fullName="+fullName+ "&isDoctor="+isDoctor+ "&qualification="+qualification+ "&College="+College+ "&CompletionYear="+CompletionYear+ "&Specilizations="+Specilizations+ "&specialized="+specialized+ "&CouncilRegistrationNumber="+CouncilRegistrationNumber+ "&CouncilName="+CouncilName+ "&CouncilYear="+CouncilYear+ "&CertificatePath="+CertificatePath+ "&IDProofPath="+IDProofPath+ "&isMedicalRegistrationverify="+isMedicalRegistrationverify+ "&Description="+Description+ "&Experince="+Experince+ "&City="+City+ "&DoctorImagePath="+DoctorImagePath+ "&EmailID="+EmailID+ "&PersonalContact="+PersonalContact+ "&BusinessContact="+BusinessContact;
}


function validateform()
{
		var fullName=document.getElementById("fullName").value;
		var qualification=document.getElementById("qualification").value;
		var College=document.getElementById("College").value;
		var CompletionYear=document.getElementById("CompletionYear").value;
		var Specilizations=document.getElementById("Specilizations").value;
		var specialized=document.getElementById("specialized").value;
		var CouncilRegistrationNumber=document.getElementById("CouncilRegistrationNumber").value;
		var CouncilName=document.getElementById("CouncilName").value;
		var CouncilYear=document.getElementById("CouncilYear").value;
		var CertificatePath=document.getElementById("CertificatePath").value;
		var IDProofPath=document.getElementById("IDProofPath").value;
		var isMedicalRegistrationverify=document.getElementById("isMedicalRegistrationverify").value;
		var Description=document.getElementById("Description").value;
		var Experince=document.getElementById("Experince").value;
		var City=document.getElementById("City").value;
		var DoctorImagePath=document.getElementById("DoctorImagePath").value;
		var EmailID=document.getElementById("EmailID").value;
		var PersonalContact=document.getElementById("PersonalContact").value;
		var BusinessContact=document.getElementById("BusinessContact").value;
	
	
	if(fullName.value=='' )
	{
		alert("please enter fullName!");
		fullName.focus();
		return false;
	}
	else if (qualification.value=='')
	{
		alert("please enter qualification!");
		qualification.focus();
		return false;
	}

	else if (College.value=='')
	{
		alert("please enter College!");
		College.focus();
		return false;
	}
	else if (CompletionYear.value=='')
	{
		alert("please enter CompletionYear!");
		CompletionYear.focus();
		return false;
	}
	else if (Specilizations.value=='')
	{
		alert("please enter Specilizations!");
		Specilizations.focus();
		return false;
	}
	else if (specialized.value=='')
	{
		alert("please enter specialized!");
		specialized.focus();
		return false;
	}
	else if (CouncilRegistrationNumber.value=='')
	{
		alert("please enter CouncilRegistrationNumber!");
		CouncilRegistrationNumber.focus();
		return false;
	}
	else if (CouncilName.value=='')
	{
		alert("please enter CouncilName!");
		CouncilName.focus();
		return false;
	}
	else if (CouncilYear.value=='')
	{
		alert("please enter CouncilYear!");
		CouncilYear.focus();
		return false;
	}
	else if (CertificatePath.value=='')
	{
		alert("please enter CertificatePath!");
		CertificatePath.focus();
		return false;
	}
	else if (IDProofPath.value=='')
	{
		alert("please enter IDProofPath!");
		IDProofPath.focus();
		return false;
	}
	else if (Description.value=='')
	{
		alert("please enter Description!");
		Description.focus();
		return false;
	}
	else if (Experince.value=='')
	{
		alert("please enter Experince!");
		Experince.focus();
		return false;
	}
	else if (City.value=='')
	{
		alert("please enter City!");
		City.focus();
		return false;
	}
	else if (DoctorCollegePath.value=='')
	{
		alert("please enter DoctorCollegePath!");
		DoctorCollegePath.focus();
		return false;
	}
	else if (EmailID.value=='')
	{
		alert("please enter EmailID!");
		EmailID.focus();
		return false;
	}
	else if (PersonalContact.value=='')
	{
		alert("please enter PersonalContact!");
		PersonalContact.focus();
		return false;
	}
	else if (BusinessContact.value=='')
	{
		alert("please enter BusinessContact!");
		BusinessContact.focus();
		return false;
	}
	
}


