package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.TaskListPage;

public class CustomerModule extends BaseClass{
	 @Test
	    public void CreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	        Reporter.log("CreateCustomer", true);
	        EnterTimeTrackPage e = new EnterTimeTrackPage(driver);
	        e.getTasktab().click();
		    TaskListPage t = new TaskListPage(driver);
		    FileLib f = new FileLib();
		     String customername=f.getExcelData("CreateCustomer", 1, 5);
		     String customerdescription=f.getExcelData("CreateCustomer", 1, 7);
			Thread.sleep(2000);
			t.getAddnewbtn().click();
			Thread.sleep(2000);
			t.getNewcustmerbtn().click();
			Thread.sleep(2000);
			t.getCustomerNametxt().sendKeys(customername);
			Thread.sleep(2000);
			t.getCustomerDescription().sendKeys(customerdescription);
			Thread.sleep(2000);
			t.getSelectcustmerinfoDD().click();
			Thread.sleep(2000);
			t.getOurcompanybtn().click();
			Thread.sleep(2000);
			t.getCreatecustomerbtn().click();
	}
	
	    }
	

