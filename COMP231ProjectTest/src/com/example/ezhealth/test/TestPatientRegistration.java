package com.example.ezhealth.test;


import android.test.AndroidTestCase;

import com.example.ezhealth.PatientRegistration;

import junit.framework.TestCase;

public class TestPatientRegistration extends AndroidTestCase {

public void testConstructorRecp(){
		
	PatientRegistration i = new PatientRegistration();
		assertNotNull(i);
	}
	
	public boolean testEmailValidatiionCheckValid()
	{
		boolean check=false;
		String myEmail="sukh@yahoo.com";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkEmailCorrect(myEmail);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testEmailValidatiionCheckInvalid()
	{
		boolean check=false;
		String myEmail="sukh@yahoocom";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkEmailCorrect(myEmail);
		assertFalse(check);
		
		return check;
	}
	
	public boolean testcheckPhoneCorrectValid()
	{
		boolean check=false;
		String myPhone="1234567890";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkPhoneCorrect(myPhone);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckPhoneCorrectInvalid()
	{
		boolean check=false;
		String myPhone="12345678";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkPhoneCorrect(myPhone);
		assertFalse(check);
		
		return check;
	}
	
	public boolean testcheckDOBCorrectValid()
	{
		boolean check=false;
		String myDOB="17/05/1990";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkDOBCorrect(myDOB);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckDOBCorrectInvalid()
	{
		boolean check=false;
		String myDOB="05/17/1990";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkDOBCorrect(myDOB);
		assertFalse(check);
		
		return check;
	}
	
	public boolean testcheckFnameCorrectValid()
	{
		boolean check=false;
		String myFname="Sukh";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkFnameCorrect(myFname);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckFnameCorrectInvalid()
	{
		boolean check=false;
		String myFname="Sukh123";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkFnameCorrect(myFname);
		assertFalse(check);
		
		return check;
	}
	public boolean testcheckLnameCorrectValid()
	{
		boolean check=false;
		String myLname="Gill";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkLnameCorrect(myLname);
		assertTrue(check);
		
		return check;
	}
	
	public boolean testcheckLnameCorrectInvalid()
	{
		boolean check=false;
		String myLname="Gill123";
		PatientRegistration aR=new PatientRegistration();
		assertNotNull(aR);
		check=aR.checkLnameCorrect(myLname);
		assertFalse(check);
		
		return check;
	}

}
