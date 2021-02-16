package org.stepDefintion;

import org.baseMethods.Base;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HooksClass extends Base{
	@Before
	public void beforeExecution() {
		chrome();
		maxWindow();
	}
	@After
	public void afterExecution() {
		close();
	}
	
	

}
