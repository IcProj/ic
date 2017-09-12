function submitToParent(){
	
	var DiagnosticCenterName=document.getElementById("DiagnosticCenterName").value;();
	var Country=document.getElementById("Country").value;();
	var StateName=document.getElementById("StateName").value;();
	var City=document.getElementById("City").value;();
	var PinCode=document.getElementById("PinCode").value;();
	var StreetName=document.getElementById("StreetName").value;();
	var PhoneNumber=document.getElementById("PhoneNumber").value;();
	var DiagnosticCenterPhoto=document.getElementById("DiagnosticCenterPhoto").value;();
	var Descripition=document.getElementById("Descripition").value;();
	var SamplesPickup=document.getElementById("SamplesPickup").value;();
	var ContactPerson=document.getElementById("ContactPerson").value;();
	var DiagnosticsCenterLicenseNumber =document.getElementById("DiagnosticsCenterLicenseNumber").value;();
	var DiagnosticsCenterLicenseDocument=document.getElementById("DiagnosticsCenterLicenseDocument").value;();
	
	if(validateform()
	{
		 addDoctorProfile(DiagnosticCenterName, Country, StateName, City, PinCode, StreetName, PhoneNumber, DiagnosticCenterPhoto, Descripition, ContactPerson, SamplesPickup, DiagnosticsCenterLicenseNumber, DiagnosticsCenterLicenseDocument);
	}else 
		return false;
}
function addDoctorProfile(DiagnosticCenterName, Country, StateName, City, PinCode, StreetName, PhoneNumber, DiagnosticCenterPhoto, Descripition, ContactPerson, SamplesPickup, DiagnosticsCenterLicenseNumber, DiagnosticsCenterLicenseDocument);
{
	document.location.href="DoctorServlet?action=Submint&DiagnosticCenterName="+DiagnosticCenterName"&Country="+Country+"& StateName="+StateName+"& City="+City+"& PinCode="+PinCode+"& StreetName="+StreetName+"& PhoneNumber="+PhoneNumber+"& DiagnosticCenterPhoto="+DiagnosticCenterPhoto+"& Descripition="+Descripition+"& ContactPerson="+ContactPerson+"& SamplesPickup="+SamplesPickup+"& DiagnosticsCenterLicenseNumber="+DiagnosticsCenterLicenseNumber+"& DiagnosticsCenterLicenseDocument="+DiagnosticsCenterLicenseDocument+";
}
function validateform()
{
	var DiagnosticCenterName=document.getElementById("DiagnosticCenterName").value;();
	var Country=document.getElementById("Country").value;();
	var StateName=document.getElementById("StateName").value;();
	var City=document.getElementById("City").value;();
	var PinCode=document.getElementById("PinCode").value;();
	var StreetName=document.getElementById("StreetName").value;();
	var PhoneNumber=document.getElementById("PhoneNumber").value;();
	var DiagnosticCenterPhoto=document.getElementById("DiagnosticCenterPhoto").value;();
	var Descripition=document.getElementById("Descripition").value;();
	var SamplesPickup=document.getElementById("SamplesPickup").value;();
	var ContactPerson=document.getElementById("ContactPerson").value;();
	var DiagnosticsCenterLicenseNumber =document.getElementById("DiagnosticsCenterLicenseNumber").value;();
	var DiagnosticsCenterLicenseDocument=document.getElementById("DiagnosticsCenterLicenseDocument").value;();
	
	
	if(DiagnosticCenterName.value=='' )
	{
		alert("please enter DiagnosticCenterName!");
		DiagnosticCenterName.focus();
		return false;
	}
else if (DiagnosticCenterName.value=='')
	{
		alert("please enter DiagnosticCenterName!");
		DiagnosticCenterName.focus();
		return false;
	}
		else if (Country.value=='')
	{
		alert("please enter Country!");
		Country.focus();
		return false;
	}
	else if (StateName.value=='')
	{
		alert("please enter StateName!");
		StateName.focus();
		return false;
	}
		else if (PinCode.value=='')
	{
		alert("please enter PinCode!");
		PinCode.focus();
		return false;
	}
		else if (StreetName.value=='')
	{
		alert("please enter StreetName!");
		StreetName.focus();
		return false;
	}
		else if (PhoneNumber.value=='')
	{
		alert("please enter PhoneNumber!");
		PhoneNumber.focus();
		return false;
	}
		else if (DiagnosticCenterPhoto.value=='')
	{
		alert("please enter DiagnosticCenterPhoto!");
		DiagnosticCenterPhoto.focus();
		return false;
	}
		else if (Descripition.value=='')
	{
		alert("please enter Descripition!");
		Descripition.focus();
		return false;
	}
		else if (ContactPerson.value=='')
	{
		alert("please enter ContactPerson!");
		ContactPerson.focus();
		return false;
	}
		else if (SamplesPickup.value=='')
	{
		alert("please enter SamplesPickup!");
		SamplesPickup.focus();
		return false;
	}
		else if (DiagnosticsCenterLicenseNumber.value=='')
	{
		alert("please enter DiagnosticsCenterLicenseNumber!");
		DiagnosticsCenterLicenseNumber.focus();
		return false;
	}
		else if (DiagnosticsCenterLicenseDocument.value=='')
	{
		alert("please enter DiagnosticsCenterLicenseDocument!");
		DiagnosticsCenterLicenseDocument.focus();
		return false;
	}
}
