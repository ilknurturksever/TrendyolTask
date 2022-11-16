package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistirationPages {


    public RegistirationPages() {PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@class='link account-user']")
    public WebElement girisButon;

    @FindBy(xpath = "//*[@class='signup-button']")
    public WebElement uyeOlButonu;

    @FindBy(id = "register-email")
    public WebElement emailBox;

    @FindBy(id = "register-password-input")
    public WebElement sifreBox;

    @FindBy(xpath = "(//*[text()='Kadın'])[3]")
    public WebElement cinsiyetBox;

    @FindBy(xpath = "//button[@data-testid='submit-button']")
    public WebElement uyelikButonu;

    @FindBy(css = "[name='personal-data-error']")
    public WebElement dataVeriButonu;



}
