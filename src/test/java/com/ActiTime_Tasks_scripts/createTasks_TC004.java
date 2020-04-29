package com.ActiTime_Tasks_scripts;

import org.testng.annotations.Test;

import com.ActiTime_utilities.baseClass;
import com.ActiTime_webpages.addNewTasksPage;
import com.ActiTime_webpages.openTasksPage;

public class createTasks_TC004 extends baseClass
{
	@Test
	public void testCreateTasks_TC004() 
	{
		openTasksPage otp=new openTasksPage();
		otp.clickAddNewTasks();
		log.info("*****AddNewTasksButton is clicked******");

		addNewTasksPage antp=new addNewTasksPage();
		antp.selectCustomerNameDropdown("cc");
		log.info("*****CustomerName is selected*****");

		antp.selectProjectNameDropdown("cc1");
		log.info("*****ProjectName is selected*****");

		antp.enterTasksNameTextfield("proceessing");
		log.info("*****TasksName is entered*****");

		antp.selectDateInTasks();
		log.info("*****DateIcon is selected*****");

		antp.selectYear("2015");
		log.info("*****Year is selected*****");

		antp.selectMonth("May");
		log.info("*****MonthName is selected*****");

		antp.enterDate("14");
		log.info("*****Date is selected*****");

		antp.billingType("Billable");
		log.info("*****BillingType is selected*****");

		antp.clickCreateTasksbutton();
		log.info("*****CreateTasksButton is clicked*****");

		String s=otp.retriveMsg();
		System.out.println(s);
		log.info("*****SuccessMsg is retrived*****");
	}
}
