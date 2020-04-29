package com.ActiTime_Project_scripts;


import org.testng.annotations.Test;

import com.ActiTime_utilities.baseClass;
import com.ActiTime_webpages.addNewProjectPage;
import com.ActiTime_webpages.openTasksPage;
import com.ActiTime_webpages.projectsAndCustomersPage;


@Test
public class createProject_TC002 extends baseClass
{
	public void testCreateProject_TC002() 
	{ 
		//String customerName=excelOperation.readData("Sheet2", 1,1);
	//	String projectName=excelOperation.readData("Sheet2", 1,2);
		
	openTasksPage otp=new openTasksPage();
	otp.clickProjectAndCustomerlink();
	log.info("*****ProjectAndCustomerlink is clicked*****");
	
projectsAndCustomersPage pacp=new projectsAndCustomersPage();
pacp.clickAddNewProject();
log.info("*****AddNewProjectButton is clicked*****");

addNewProjectPage anpp=new addNewProjectPage();
anpp.selectCustomerNameDropdown("aa");
log.info("*****CustomerName is selected*****");

anpp.enterProjectNameTextField("ss1");
log.info("*****ProjectName is entered*****");

anpp.clickCreateProjectButton();
log.info("*****CreateProjectButton is clicked*****");
String s=pacp.retriveMsg();
System.out.println(s);
log.info("*****Success Msg is retrived*****");
}
}