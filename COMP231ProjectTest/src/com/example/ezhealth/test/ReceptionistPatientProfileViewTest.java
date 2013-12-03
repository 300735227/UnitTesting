package com.example.ezhealth.test;

import com.example.ezhealth.AddReceptionist;
import com.example.ezhealth.ReceptionistDoctorProfileView;

import junit.framework.TestCase;

public class ReceptionistPatientProfileViewTest extends TestCase {

	public void testConstructorRecpView(){
		ReceptionistDoctorProfileView r = new ReceptionistDoctorProfileView();
		assertNotNull(r);
	}


}
