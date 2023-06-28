package cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ValidateLogin extends TestBase {
	
	
	String u; String p;
	
	
	@FindBy(xpath = "//input[contains(@placeholder,'Username')]")
	public WebElement username;

	@FindBy(xpath = "//input[contains(@placeholder,'Password')]")
	public WebElement password;

	@FindBy(xpath = "//input[contains(@value,'Login')]")
	public WebElement login;
	
	@FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div") public WebElement test;
	
   
	
	public ValidateLogin() {
		
		PageFactory.initElements(driver, this);
		
	}
	public void loginValidation() {
		username.sendKeys("standard_user");
		u = username.getText();
		System.out.println(u);
		password.sendKeys("secret_sauce");
		p = password.getText();
		System.out.println(p);
		login.click();
	}
	public void validUser_password()
	{
		String un= "standard_user";
		String pd = "secret_sauce"; 
		if(u.equals(un) && p.equals(pd))
		{
			System.out.println("VALID USERNAME AND PASSWORD");}
		else
		{
			System.out.println("INVALID USERNAME AND PASSWORD");
			
		}
	}
	public void SuccessValidate()
	{
		
		
		String q =  test.getText();
		
		if(q.equals("Swag Labs"))
		{
			System.out.println("Test is PAssed");
		}
	}
	public void teardown()
	{
		driver.close();
	}

}
