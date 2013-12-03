package com.example.ezhealth.test;

import com.example.ezhealth.AddReceptionist;
import android.test.AndroidTestCase;

public class AddReceptionistTest extends AndroidTestCase {

	public void testConstructorRecp(){
		
		AddReceptionist i = new AddReceptionist();
		assertNotNull(i);
	}
	
	public boolean testEmailValidatiionCheckValid()
	{
		boolean check=false;
		String myEmail="sukh@yahoo.com";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkEmailCorrect(myEmail);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testEmailValidatiionCheckInvalid()
	{
		boolean check=false;
		String myEmail="sukh@yahoocom";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkEmailCorrect(myEmail);
		assertFalse(check);
		
		return check;
	}
	
	public boolean testcheckPhoneCorrectValid()
	{
		boolean check=false;
		String myPhone="1234567890";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkPhoneCorrect(myPhone);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckPhoneCorrectInvalid()
	{
		boolean check=false;
		String myPhone="12345678";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkPhoneCorrect(myPhone);
		assertFalse(check);
		
		return check;
	}
	
	public boolean testcheckDOBCorrectValid()
	{
		boolean check=false;
		String myDOB="17/05/1990";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkDOBCorrect(myDOB);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckDOBCorrectInvalid()
	{
		boolean check=false;
		String myDOB="05/17/1990";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkDOBCorrect(myDOB);
		assertFalse(check);
		
		return check;
	}
	
	public boolean testcheckFnameCorrectValid()
	{
		boolean check=false;
		String myFname="Sukh";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkFnameCorrect(myFname);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckFnameCorrectInvalid()
	{
		boolean check=false;
		String myFname="Sukh123";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkFnameCorrect(myFname);
		assertFalse(check);
		
		return check;
	}
	public boolean testcheckLnameCorrectValid()
	{
		boolean check=false;
		String myLname="Gill";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkLnameCorrect(myLname);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckLnameCorrectInvalid()
	{
		boolean check=false;
		String myLname="Gill123";
		AddReceptionist aR=new AddReceptionist();
		assertNotNull(aR);
		check=aR.checkLnameCorrect(myLname);
		assertFalse(check);
		
		return check;
	}
}
