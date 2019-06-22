package testCase;

import org.testng.annotations.Test;

import base.Config;
import locators.Locators;
import values.Value;

public class ExpediaSignup extends Config{
	Locators loc=new Locators();
	Value val= new Value();
	 
	 @Test 
	
	// we can set the priority in @test like @Test(0), that means we can set which test case should go when.
	//@ Test( dependsOnMethods={"method_name/test case name"}
	 //@Test(priority=3, enabled=false)for skip test case.
	 //@Test
	public void signup(){
		 typeByid(loc.createId);
		 clickByid(loc.createAccId);
		 typeByfirstname (loc.createId, val.firstNameValue);	
		 typeBylastname(loc.createAccId, val.lastNameValue);
		 typeByemail (loc.exEmail, val.emailValue);
		 typeBypassword(loc.exPassword, val.passwordValue);
		 typeBysubmit(loc.exSubmit);	
	}
	 
}
