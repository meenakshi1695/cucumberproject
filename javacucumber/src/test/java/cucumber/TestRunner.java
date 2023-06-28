package cucumber;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)				
@CucumberOptions(features="C:\\Users\\7cancel\\eclipse-workspace\\javacucumber\\src\\test\\java\\cucumber\\userlogin.feature",glue={"cucumber"}, plugin = { "pretty", "html:target/TC1.html"})

public class TestRunner{

}
