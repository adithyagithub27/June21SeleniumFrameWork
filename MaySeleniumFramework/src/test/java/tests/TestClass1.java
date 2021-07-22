package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 {
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println(" before each method executed");
		
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after each method executed");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite executed");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite executed");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("I am running before  test");
		
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("I am runing after  test");
	}
	
	@Test(groups= {"smoke","regression"})
	public void test1() {		
		System.out.println("test1 executed");
	}
	
	@Test(groups= {"regression"})
	public void test2() {
		System.out.println("test2 executed");
	}

}
