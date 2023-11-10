package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@Netbank")
	public void netBankingSetup() {
		System.out.println("setup the db entries here");
	}
	
	@Before("@Mortgage")
	public void mortgagegSetup() {
		System.out.println("setup mortgage here");
	}
	
	@After
	public void teardown() {
		System.out.println("completed execution");
	}

}
