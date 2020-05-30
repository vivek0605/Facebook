package com.testFacebook;

import java.io.IOException;

import org.testng.annotations.Test;

import com.generics.ActiTime.BaseTest;
import com.pages.FacebookSignup.POMFBSignup;


public class TestPOMFBSignup extends BaseTest{
@Test
public void Signup() throws IOException {
	POMFBSignup signup=new POMFBSignup(driver);
	signup.signupMethod();
}
}
