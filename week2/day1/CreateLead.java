package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		
		//To add driver to the code
		
				WebDriverManager.chromedriver().setup();
				
				// Open a browser
				
				ChromeDriver driver = new ChromeDriver();
				
				//To load an url
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//To maximize the browser
				driver.manage().window().maximize();
				
				WebElement elementUsername = driver.findElement(By.id("username"));
				elementUsername.sendKeys("Demosalesmanager");
				
				WebElement elementPassword = driver.findElement(By.id("password"));
				elementPassword.sendKeys("crmsfa");
				
				//Click on Login Button using class Locator
				WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
				
				elementLogin.click();
				
				WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
				elementCRMSFA.click();
				
				WebElement elementLeads = driver.findElement(By.linkText("Leads"));
				elementLeads.click();
				
				WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
				elementCreateLead.click();
				
				//Enter CompanyName Field Using id Locator
				WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
				elementCompanyName.sendKeys("TCS");
				
				//Enter FirstName Field Using id Locator
				WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
				elementFirstName.sendKeys("Chakravarthy");

				
				//Enter LastName Field Using id Locator
				WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
				elementLastName.sendKeys("G");
				
				//Enter FirstNameLocal Field Using id Locator
				WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
				elementFirstNameLocal.sendKeys("Chak");
				
				//Enter Department Field Using any Locator
				WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
				elementDepartment.sendKeys("Credit Card");
				
				//Enter Description Field Using any Locator
				WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
				elementDescription.sendKeys("Credit Card Payments");
				
				//Enter your email in the Email address field
				WebElement elementEmailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
				elementEmailAddress.sendKeys("gchakravarthy08@gmail.com");
				
				//Select State.Province as Network Using Visible Text
				WebElement elementState = driver.findElement(By.name("generalStateProvinceGeoId"));
				Select state = new Select(elementState);
				state.selectByVisibleText("New York");
				
				//Click on create Button
				//Enter FirstName Field Using id Locator
				WebElement elementSubmit = driver.findElement(By.name("submitButton"));
				elementSubmit.click();
				
				//Get the Title of Resulting Page
				String title = driver.getTitle();
				
				if(driver.getTitle().contains("View Lead | opentaps CRM"))
				
				{
					System.out.println("Lead Created Sucessfully");
					
				}
				else {
					System.out.println("Lead Creation Failed");
					
				}
	}
	
}

					
				
				
				
					
				
	



				
				
				
				
				
				
				
				
				
				
				
				


				
				
				


				
				
				
						
					
				
				
				
			
				
				
				
				
				
				
				
				
	


