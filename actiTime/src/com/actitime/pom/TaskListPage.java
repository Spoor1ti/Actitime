package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	
		@FindBy(xpath= "//div[text()='Add New']")
	    private WebElement addnewbtn;
		
		@FindBy(xpath="//div[text()='+ New Customer']")
		 private WebElement newcustmerbtn;
		
		@FindBy(id = "customerLightBox_nameField")
		private WebElement customerNametxt;
		
		@FindBy(id="customerLightBox_descriptionField")
		private WebElement customerDescription;
		
		@FindBy(xpath="//button[contains(text(),'Select')]")
		private WebElement selectcustmerinfoDD;
		
		@FindBy(xpath="//a[text()='Our Company']")
		private WebElement ourcompanybtn;
		
		@FindBy(xpath="//span[text()='Create Customer']")
		private WebElement createcustomerbtn;
		
		 public TaskListPage(WebDriver driver) {
		        PageFactory.initElements(driver, this);
		    }
		 
		 
		public WebElement getAddnewbtn() {
			return addnewbtn;
		}

		public WebElement getNewcustmerbtn() {
			return newcustmerbtn;
		}

		public WebElement getCustomerNametxt() {
			return customerNametxt;
		}

		public WebElement getCustomerDescription() {
			return customerDescription;
		}

		public WebElement getSelectcustmerinfoDD() {
			return selectcustmerinfoDD;
		}

		public WebElement getOurcompanybtn() {
			return ourcompanybtn;
		}

		public WebElement getCreatecustomerbtn() {
			return createcustomerbtn;
		}
		    

	}


