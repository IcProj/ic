<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Bootstrapped Styled File Browse Button</title>
  
  
  <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css'>

      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>
    <div class="container">

    <form class="well form-horizontal" action=" " method="post"  id="Personal Profile">
</form>

<!-- Form Name -->
<!-- MedicalstoreName  input-->
       <div class="form-group">
  <label class="col-md-4 control-label">MedicalstoreName</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="MedicalstoreName" placeholder="MedicalstoreName " class="form-control"  type="text">
    </div>
  </div>
</div>
<!-- Country  input-->
<div class="form-group"> 
  <label class="col-md-4 control-label">Country</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    <select name="country" class="form-control selectpicker" >
      <option value=" " >Please select your country</option>
			<option>India</option>
			<option>United States</option>
    </select>
  </div>
</div>
</div>
<!-- StateName  input-->
<div class="form-group"> 
  <label class="col-md-4 control-label">State</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    <select name="state" class="form-control selectpicker" >
      <option value=" " >Please select your state</option>
			<option>Andaman and Nicobar Islands</option>
			<option>Andhra Pradesh</option>
			<option>Arunachal Pradesh</option>
			<option>Assam</option>
			<option>Bihar</option>
			<option>Chandigarh</option>
			<option>Chhattisgarh</option>
			<option>Dadra and Nagar Haveli</option>
			<option>Daman and Diu</option>
			<option>Delhi</option>
			<option>Goa</option>
			<option>Gujarat</option>
			<option>Haryana</option>
			<option>Himachal Pradesh</option>
			<option>Jammu and Kashmir</option>
			<option>Jharkhand</option>
			<option>Karnataka</option>
			<option>Kerala</option>
			<option>Lakshadweep</option>
			<option>Madhya Pradesh</option>
			<option>Maharashtra</option>
			<option>Manipur</option>
			<option>Meghalaya</option>
			<option>Mizoram</option>
			<option>Nagaland</option>
			<option>Odisha</option>
			<option>Puducherry</option>
			<option>Punjab</option>
			<option>Rajasthan</option>
			<option>Sikkim</option>
			<option>Tamil Nadu</option>
			<option>Tripura</option>
			<option>Uttar Pradesh</option>
			<option>Uttarakhand</option>
			<option>West Bengal</option>
    </select>
  </div>
</div>
</div>
<!-- City  input-->
<div class="form-group">
  <label class="col-md-4 control-label">City</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="City" placeholder="City" class="form-control"  type="text">
    </div>
</div>
</div>
<!-- PinCode  input-->
<div class="form-group">
  <label class="col-md-4 control-label">Pincode</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="Pincode" placeholder="Pincode" class="form-control"  type="text">
    </div>
</div>
</div>
<!-- Stree name input-->
<div class="form-group">
  <label class="col-md-4 control-label">Street Number& Name</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <input name="Streetname" placeholder="StreetName&Number" class="form-control"  type="text">
    </div>
</div>
</div>
<!-- PhoneNumber  input-->
<div class="form-group">
  <label class="col-md-4 control-label">PhoneNumber</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="phoneNumber" placeholder="+91 1234567890" class="form-control" type="text">
    </div>
  </div>
</div>
<!-- MedicalStorePicture  input-->
<div class="form-group">
    <input type="file" name="img[]" class="file">
	<label class="col-md-4 control-label"> MedicalStorePicture</label> 
    <div class="input-group col-xs-12">
      <span class="input-group-addon"><i class="glyphicon glyphicon-picture"></i></span>
      <input type="text" class="form-control input-lg" disabled placeholder=" Profile Picture">
      <span class="input-group-btn">
        <button class="browse btn btn-primary input-lg" type="button"><i class="glyphicon glyphicon-search"></i> Browse</button>
      </span>
    </div>
  </div>
<!-- Descripition  input-->
<div class="form-group">
  <label class="col-md-4 control-label">About Store</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="Descripition" placeholder="Descripition" class="form-control" type="text">
    </div>
  </div>
</div>
<!-- ContactPerson  input-->
<div class="form-group">
  <label class="col-md-4 control-label">StoreManager</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="StoreManager" placeholder="Name" class="form-control" type="text">
    </div>
  </div>
</div>
<!-- IsVerified  input-->
<!-- DrugDelivery  input-->
<!-- DrugLicenseNumber  input-->
<div class="form-group">
  <label class="col-md-4 control-label">DrugLicenseNumber</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="DrugLicenseNumber" placeholder="DrugLicenseNumber" class="form-control" type="text">
    </div>
  </div>
</div>
<!-- DrugLicenseDocument  input-->
<div class="form-group">
    <input type="file" name="img[]" class="file">
	<label class="col-md-4 control-label"> DrugLicense Document</label> 
    <div class="input-group col-xs-12">
      <span class="input-group-addon"><i class="glyphicon glyphicon-picture"></i></span>
      <input type="text" class="form-control input-lg" disabled placeholder="DrugLicense Document">
      <span class="input-group-btn">
        <button class="browse btn btn-primary input-lg" type="button"><i class="glyphicon glyphicon-search"></i> Browse</button>
      </span>
    </div>
  </div>
</div>
<!-- Success message -->
<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i>Profile Updated.</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" class="btn btn-warning" >Submit<span class="glyphicon glyphicon-save" onclick="submitToParent()"></span></button>
  </div>
</div>
    <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>	
	<script src='http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js'></script>
    <script src="js/index.js"></script>

</body>
</html>