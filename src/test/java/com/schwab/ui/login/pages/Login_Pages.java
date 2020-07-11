package com.schwab.ui.login.pages;

import com.schwab.ui.login.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pages {

    public Login_Pages() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//iframe[@id='LoginComponentForm']")
    public WebElement iframeLogin;

    @FindBy(css="#LoginId")
    public WebElement login;

    @FindBy(css="#Password")
    public WebElement Password;

    @FindBy (css="loginSubmitButton")
    public WebElement loginButton;
}
