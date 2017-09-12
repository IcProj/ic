<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Bootstrap 3 Contact form with Validation</title>
  <script src="https://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>


<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/css/bootstrap-datetimepicker.min.css" />

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.6/moment.min.js"></script>   
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/4.17.37/js/bootstrap-datetimepicker.min.js"></script>


  
</head>

<body>
  <div class="container">

    <form class="well form-horizontal" action=" " method="post"  id="Personal Profile">
<fieldset>

<!-- Form Name -->
<legend>Personal Profile</legend>
<!-- First_Name Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">First_Name</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="firstname" placeholder="First_Name " class="form-control"  type="text">
    </div>
  </div>
</div>
<!-- Last_Name Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Last_Name</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="lastname" placeholder="Last_Name " class="form-control"  type="text">
    </div>
  </div>
</div>
<!-- Releationship Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Releationship</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="releationship" placeholder="Releationship " class="form-control"  type="text">
    </div>
  </div>
</div>
<!--Date_Of_Birth  Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">Date_Of_Birth</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class='input-group date' id='datetimepicker1'>
                    <input type='text' class="form-control" />
                    <span class="input-group-addon">
                        <span class="glyphicon glyphicon-calendar"></span>
                    </span>
     </div>
  </div>
</div>

 
<!-- AdharCard_Number Text input-->
       <div class="form-group">
  <label class="col-md-4 control-label">AdharCard_Number</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="adharCardnumber" placeholder="AdharCard_Number " class="form-control"  type="text">
    </div>
  </div>
</div>
<div class="form-group"> 
  <label class="col-md-4 control-label">Country</label>
    <div class="col-md-4 selectContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-list"></i></span>
    <select name="country" class="form-control selectpicker" >
      <option value=" " >Please select your country</option>
			<option>India</option>
			<option>United States</option>
			<option>Australia</option>
    </select>
  </div>
</div>
</div>
<!-- STATE Select Basic -->   
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
			<option>Telangana</option>
			<option>Tripura</option>
			<option>Uttar Pradesh</option>
			<option>Uttarakhand</option>
			<option>West Bengal</option>
    </select>
  </div>
</div>
</div>

<!-- PINCODEText input-->
<div class="form-group">
  <label class="col-md-4 control-label">Pincode</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="Pincode" placeholder="Pincode" class="form-control"  type="text">
    </div>
</div>
</div>
<!-- City Text input-->
<div class="form-group">
  <label class="col-md-4 control-label">City</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="City" placeholder="City" class="form-control"  type="text">
    </div>
</div>
</div>
<!-- House Text input-->
<div class="form-group">
  <label class="col-md-4 control-label">HouseNumber</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <input name="HouseNumber" placeholder="HouseNumber" class="form-control"  type="text">
    </div>
</div>
</div>
<!-- Stree name input-->
<div class="form-group">
  <label class="col-md-4 control-label">Stret Name</label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-home"></i></span>
  <input name="Streetname" placeholder="StreetName" class="form-control"  type="text">
    </div>
</div>
</div>

<!--Phone Number Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">PhoneNumber </label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-pencil"></i></span>
  <input name="phoneNumber" placeholder="+91 1234567890" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Emergenc_Contact Text input-->
       
<div class="form-group">
  <label class="col-md-4 control-label">Emergenc_Contact </label>  
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="Emergenc_Contact" placeholder=" Family or Friend" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Success message -->
<div class="alert alert-success" role="alert" id="success_message">Success <i class="glyphicon glyphicon-thumbs-up"></i> Thanks for contacting us, we will get back to you shortly.</div>

<!-- Button -->
<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" class="btn btn-warning" >Submit<span class="glyphicon glyphicon-save" onclick="submitToParent()"></span></button>
  </div>
</div>

</fieldset>
</form>
</div>
<!-- /.container -->


    
	<script type="text/javascript">
            $(function () {
                $('#datetimepicker1').datetimepicker();
            });
            </script>

</body>
</html>
