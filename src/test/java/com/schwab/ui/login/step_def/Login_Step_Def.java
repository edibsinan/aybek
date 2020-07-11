package com.schwab.ui.login.step_def;

import com.schwab.ui.login.pages.Login_Pages;
import com.schwab.ui.login.utilities.ConfigurationReader;
import com.schwab.ui.login.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login_Step_Def {

    Login_Pages login_pages=new Login_Pages();

    @Given("User on the homepage schwab.com")
    public void user_on_the_homepage_schwab_com() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("User {string} logs is wrong loginID")
    public void user_logs_is_wrong_loginID(String signinOption) {

    String errorMessage ="The Login ID or Password is invalid.";

    WebElement iframe = Driver.getDriver().findElement(By.cssSelector("#LoginComponentForm"));

    switch (signinOption){
        case "Account Summary":
            Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            Driver.getDriver().switchTo().frame(iframe);


            WebElement selectElement=Driver.getDriver().findElement(By.cssSelector("#StartIn"));
            Select dropdownList=new Select(selectElement);
            List<WebElement> listoptions=dropdownList.getOptions();

            System.out.println("List size --> "+listoptions.size());


            if (listoptions.size()==13){
                Assert.assertEquals(listoptions.size(),13);
            }else {
                System.out.println("List size is not equal 13");
            }



            for(WebElement options:listoptions){
                System.out.println(options.getText());
            }

    }

    }
}
