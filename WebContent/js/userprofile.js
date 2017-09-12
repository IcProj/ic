function submitToParent(){
	
		var User_ID=document.getElementById("User_ID").value();
		var First_Name=document.getElementById("First_Name").value();
		var Last_Name=document.getElementById("Last_Name").value();
		var image=document.getElementById("image").value();
		var Releationship=document.getElementById("Releationship").value();
		var Date_Of_Birth=document.getElementById("Date_Of_Birth").value();
		var AdharCard_Number=document.getElementById("AdharCard_Number").value();
		var country=document.getElementById("country").value();
		var State=document.getElementById("State").value();
		var Pincode=document.getElementById("Pincode").value();
		var City=document.getElementById("City").value();
		var Address_1=document.getElementById("Address_1").value();
		var Address_2=document.getElementById("Address_2").value();
		var Phone_Number=document.getElementById("Phone_Number").value();
		var E_Mail_ID=document.getElementById("E_Mail_ID").value();
		var Emergenc_Contact=document.getElementById("Emergenc_Contact").value();
		var Emergenc_Contact_2=document.getElementById("Emergenc_Contact_2").value();
		
	
	if(validateform())
	{
           addUserProfile( User_ID, First_Name, Last_Name, image, Releationship, Date_Of_Birth, 
		   AdharCard_Number, country, State, Pincode, City, Address_1, Address_2, Phone_Number, E_Mail_ID, Emergenc_Contact, 
		   Emergenc_Contact_2);
	}else 
		return false;
	
}

function addUserProfile( User_ID, First_Name, Last_Name, image, Releationship, Date_Of_Birth, 
		   AdharCard_Number, country, State, Pincode, City, Address_1, Address_2, Phone_Number, E_Mail_ID, Emergenc_Contact, 
		   Emergenc_Contact_2, CreateDate, CreatedBy, LastModifiedBy, LastModified_Date){
	document.location.href = "UserProfileServlet?action=Submint&User_ID="+User_ID +"&First_Name="+First_Name +"&Last_Name="+Last_Name +"&image="+image +"&Releationship="+Releationship +"&Date_Of_Birth="+Date_Of_Birth +"&AdharCard_Number="+AdharCard_Number +"&country="+country +"&State="+State +"&Pincode="+Pincode +"&City="+City +"&Address_1="+Address_1 +"&Address_2="+Address_2 +"&Phone_Number="+Phone_Number +"&E_Mail_ID="+E_Mail_ID +"&Emergenc_Contact="+Emergenc_Contact +"&Emergenc_Contact_2="+Emergenc_Contact_2;
}


function validateform()
{
	var 	valid= true;
	var U_ID=document.getElementById("U_ID").value();
	var User_ID=document.getElementById("User_ID").value();
	var First_Name=document.getElementById("First_Name").value();
	var Last_Name=document.getElementById("Last_Name").value();
	var image=document.getElementById("image").value();
	var Releationship=document.getElementById("Releationship").value();
	var Date_Of_Birth=document.getElementById("Date_Of_Birth").value();
	var AdharCard_Number=document.getElementById("AdharCard_Number").value();
	var country=document.getElementById("country").value();
	var State=document.getElementById("State").value();
	var Pincode=document.getElementById("Pincode").value();
	var City=document.getElementById("City").value();
	var Address_1=document.getElementById("Address_1").value();
	var Address_2=document.getElementById("Address_2").value();
	var Phone_Number=document.getElementById("Phone_Number").value();
	var E_Mail_ID=document.getElementById("E_Mail_ID").value();
	var Emergenc_Contact=document.getElementById("Emergenc_Contact").value();
	var Emergenc_Contact_2=document.getElementById("Emergenc_Contact_2").value();
	var CreateDate=document.getElementById("CreateDate").value();
	var CreatedBy=document.getElementById("CreatedBy").value();
	var LastModifiedBy=document.getElementById("LastModifiedBy").value();
	var LastModified_Date=document.getElementById("LastModified_Date").value();
	
	
	if(phoneNumber.value=='' )
	{
		alert("please enter PhoneNumber!");
		phoneNumber.focus();
		return false;
	}
	else if (First_Name.value=='')
	{
		alert("please enter First_Name!");
		First_Name.focus();
		return false;
	}
	else if (Last_Name.value=='')
	{
		alert("please enter Last_Name!");
		Last_Name.focus();
		return false;
	}
	else if (image.value=='')
	{
		alert("please enter image!");
		image.focus();
		return false;
	}
	else if (Releationship.value=='')
	{
		alert("please enter Releationship!");
		Releationship.focus();
		return false;
	}
	else if (Date_Of_Birth.value=='')
	{
		alert("please enter Date_Of_Birth!");
		Date_Of_Birth.focus();
		return false;
	}
	else if (AdharCard_Number.value=='')
	{
		alert("please enter AdharCard_Number!");
		AdharCard_Number.focus();
		return false;
	}
	else if (country.value=='')
	{
		alert("please enter country!");
		country.focus();
		return false;
	}
	else if (State.value=='')
	{
		alert("please enter State!");
		State.focus();
		return false;
	}
	else if (Pincode.value=='')
	{
		alert("please enter Pincode!");
		Pincode.focus();
		return false;
	}
	else if (City.value=='')
	{
		alert("please enter City!");
		City.focus();
		return false;
	}
		else if (Address_1.value=='')
	{
		alert("please enter Address_1!");
		Address_1.focus();
		return false;
	}
		else if (Address_2.value=='')
	{
		alert("please enter Address_2!");
		Address_2.focus();
		return false;
	}
	else if (Phone_Number.value=='')
	{
		alert("please enter Phone_Number!");
		Phone_Number.focus();
		return false;
	}
	else if (E_Mail_ID.value=='')
	{
		alert("please enter E_Mail_ID!");
		E_Mail_ID.focus();
		return false;
	}
	else if (Emergenc_Contact.value=='')
	{
		alert("please enter Emergenc_Contact!");
		Emergenc_Contact.focus();
		return false;
	}
	else if (Emergenc_Contact_2.value=='')
	{
		alert("please enter Emergenc_Contact_2!");
		Emergenc_Contact_2.focus();
		return false;
	}
	else if (email.value=='')
	{
		alert("please enter Email!");
		email.focus();
		return false;
	}
}


