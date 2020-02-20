package com.test.chanchal.Demo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */

public class TestNG_Annotations 
{
    public static void main( String[] args )
    {
       
        TestNG_Annotations  AppObj = new TestNG_Annotations ();
        AppObj .callMethod1();
        AppObj .callMethod2();
        AppObj.callMethod3();
        AppObj .callMethod4();
        System.out.println( "Hello World!" );
    }
    @BeforeClass
    public void callMethod1()
    {
    	System.out.println("Test Before Class annotation Method");
    }
    @AfterTest
    public void callMethod2()
    {
    	System.out.println("Test After Test Annotation Method");
    }
    @Test(groups = {"TestFirst"})
    public void callMethod3()
    {
    	System.out.println("TestTest annotation Method");
    }
    @AfterClass
    public void callMethod4()
    {
    	System.out.println("Test After Class Method");
}

@AfterSuite 
public void callMethod5()
{
	System.out.println("Test After Suite Annotation");
}
@BeforeSuite 
public void callMethod6()
{
	System.out.println("Test Method for Before suite annotation ");
}


@BeforeGroups(groups = {"TestFirst"}) 
public void callMethod7()
{
	System.out.println("Test Method for Before Group annotation call");
}
@AfterGroups(groups = {"TestFirst"})
public void callMethod8()
{
	System.out.println("Test Method for After Group annotation call");
}


}
