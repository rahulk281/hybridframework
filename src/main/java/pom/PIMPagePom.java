package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PIMPagePom {
	
	
	//span[text()='PIM']                              //PIM Buttom
    @FindBy(xpath = "//span[text()='PIM']")
	WebElement PIMButton;
    
    //span[text()='Configuration ']                      // Configuration dropdown
    @FindBy(xpath = "//span[text()='Configuration ']")
    WebElement Configuration;
    
    //ul[@class='oxd-dropdown-menu']/li/a                 Whole list under confuguration dropdown
    
    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a")
    WebElement ConfigurationList;
    
	// ----------------------------------  Single element in dropdwwn configuration ------------------------------------------------
    
    //a[text()='Optional Fields']                         //Optional Fields 
    @FindBy(xpath = "//a[text()='Optional Fields']")
    WebElement optionalField;
    
    //a[text()='Custom Fields']                            //Custom Fields
    @FindBy(xpath = "//a[text()='Custom Fields']")
    WebElement customField;
    
    //a[text()='Custom Fields']                           //Custom Fields
    @FindBy(xpath = "//a[text()='Data Import']")
    WebElement dataImport;
    
   //a[text()='Reporting Methods']                         //Reporting Method
    @FindBy(xpath = "//a[text()='Reporting Methods']")
    WebElement reportingMethod;
     
  //a[text()='Termination Reasons']                         //Termination Reasons
    @FindBy(xpath = "//a[text()='Termination Reasons']")
    WebElement terminateProcess;
    
//--------------------------------------------------------------------------------------------------------------    
    
  //a[text()='Employee List']                               //Employee List
    @FindBy(xpath = "Employee List")
    WebElement employeeList;
    
    
                          // WebElement Under Employee List 
    
    
                   //input[@placeholder = 'Type for hints...'][1]
                   @FindBy(xpath = "//input[@placeholder = 'Type for hints...'][1]")
                    WebElement employeeName;
    
    
                  //  (//input[@class='oxd-input oxd-input--active'])[2]             //Employee ID
                   @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
                   WebElement employeeId;
                   
                   // (//div[@class='oxd-select-text oxd-select-text--active'])[1]     //Employee Status
                   @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
                   WebElement employeeStatus;
                   
                  // (//div[@class='oxd-select-text oxd-select-text--active'])[2]    //include
                   @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
                   WebElement include;
                   
                   // (//input[@placeholder='Type for hints...'])[2]                           //supervisor name
                   @FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
                   WebElement supervisorName;
                   
                   // (//div[@class='oxd-select-text oxd-select-text--active'])[3]                //job title
                   @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
                   WebElement jobTitle;
                   
                  // (//div[@class='oxd-select-text oxd-select-text--active'])[4]              // Sub Unit
                    @FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
                	WebElement subUnit;
                   
                  //button[@type = 'reset']                                                   // Reset Button
                   @FindBy(xpath = "//button[@type = 'reset']")
                    WebElement resetButton;
                    
                   
                 //button[@type = 'submit']                                                 Submit Button
                   @FindBy(xpath = "//button[@type = 'submit']")
                   WebElement submitButton;
//--------------------------------------------------------------------------------------------------------------------------------------------------                    
    
    //a[text()='Add Employee']                              //Add Employee
    @FindBy(xpath = "//a[text()='Add Employee']")
    WebElement addEmplyee;
    
    
                        //input[@placeholder='First Name']                                  Firstname
    					@FindBy(xpath = "//input[@placeholder='First Name']")
    					WebElement firstName;
    					
    					
    					//input[@placeholder='Middle Name']                                  Middle Name
                         @FindBy(xpath = "//input[@placeholder='Middle Name']")
                         WebElement middleName;
                         
                         
                       //input[@placeholder='Last Name']
                         @FindBy(xpath = "//input[@placeholder='Last Name']")
                         WebElement lastName;
                         
                         
                         // (//input[@class='oxd-input oxd-input--active'])[2]
                         @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
                         WebElement employeeId2;
    
    
    //a[text() = 'Reports']                              // Report
    @FindBy(xpath = "//a[text() = 'Reports']")
    WebElement report;
    
    
}
