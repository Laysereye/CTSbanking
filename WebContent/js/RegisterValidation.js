function formValidation()
{
var ufname=document.register.first_name;
var ulname=document.register.last_name;
var ucontact=document.register.phone;
var uaddress=document.register.address;
var uemailid=document.register.email;
var upassword=document.register.password;
var upassword1=document.register.re_password;
var ugender=document.register.g;
var udob=document.register.dob;
if(fname_validate(ufname))
	{
	if(lname_validate(ulname))
		{
		if(contact_validate(ucontact))
			{
			if(address_validate(uaddress))
				{
				if(email_validate(uemailid))
					{
					if(pass_validate(upassword,7,12))
						{
						if(pass1_validate(upassword1,7,12))
							{
							
								return true;
								
						
							}
						
						}
					}
				}
			}
		}
	}
		return false;	
}
function fname_validate(ufname)
{
var letter=/^[A-Za-z]+$/;
if(ufname.value.match(letter))
	{
	document.getElementById("fname").innerText="";
	return true;
	}
else
	{
	document.getElementById("fname").innerHTML="First Name must be Alphabetic";
	//alert("First Name must be Alphabetic");
	ufname.focus();
	return false;
	
	}
}

function lname_validate(ulname)
{
var letter=/^[A-Za-z]+$/;
if(ulname.value.match(letter))
	{
	document.getElementById("lname").innerText="";
	return true;
	}
else
	{
	document.getElementById("lname").innerHTML="Last Name must be Alphabetic";
	//alert("Last Name must be Alphabetic");
	ulname.focus();
	return false;
	
	}
}

function contact_validate(ucontact)
{
var con_len=ucontact.value.length;
if(con_len==10)
	{
	var number=/^[0-9]+$/;
	if(ucontact.value.match(number))
		{
		document.getElementById("con").innerText="";
		return true;
		}
	else
		{
		document.getElementById("con").innerHTML="Contact must be in numeric";
		//alert("Contact must be in numeric");
		ucontact.focus();
		return false;
		}
	}
else
	{
	document.getElementById("con").innerHTML="Contact length must be 10 digit";
	//alert("Contact length must be 10 digit");
	ucontact.focus();
	return false;
	}
}
function address_validate(uaddress)
{
var letter=/^[A-Za-z0-9_\-\,\@\.\/\ ]+$/;
if(uaddress.value.match(letter))
	{
	return true;
	}
else
	{
	alert("Please Enter valid address");
	uaddress.focus();
	return false;
	}
}

function email_validate(uemailid)
{
	var letter=/^[A-Za-z0-9_\.\-]+\@(([a-zA-Z0-9\-])+\.)+([A-Za-z0-9]{2,4})+$/;
if(uemailid.value.match(letter))
	{
	return true;
	
	}
else
	{
	alert("Please Enter valid emailid");
	uemailid.focus();
	return false;
	}
}
function pass_validate(upassword,my,mx)
{
var pass_len=upassword.value.length;
if(pass_len==0||pass_len<my||pass_len>mx)
	{
	alert("password length must be in b/w "+my+" to "+mx);
	upassword.focus();
	return false;
	
	}
else
	{
	return true;
	}
}
function pass1_validate(upassword1,my,mx)
{
var pass_len=upassword1.value.length;
if(pass_len==0||pass_len<my||pass_len>mx)
	{
	alert("New password length must be in b/w "+my+" to "+mx);
	upassword1.focus();
	return false;
	
	}
else
	{
	return true;
	}
}

function gender_validate(ugender)
{
var g=ugender.value;
if(g=="default")
	{
	alert("please select a gender from the list");
	ugender.focus();
	return false;
	}
else
	{
	return true;
	}

}










