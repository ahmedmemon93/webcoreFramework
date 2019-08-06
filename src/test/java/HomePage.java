import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Helper {

    @FindBy(css = "span.photoContainer.forceSocialPhoto")
    WebElement profilePhoto;
    @FindBy (css = "button.slds-button.slds-p-horizontal__xxx-small.slds-button_icon-small.slds-button_icon-container[title='Show Navigation Menu']")
    WebElement dropDown;

    WebDriver driver= BrowserSetup.driver;

    String menuId="navMenuList";
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        waitUntilElementVisible(profilePhoto);
    }

    public SrpNewInquiryForm selectFromNavMenu(String option){

        dropDown.click();
        MenuDropDown dropDown = new MenuDropDown(new ElementSelector.ById(menuId));
        dropDown.selectItemFromList(option).click();
        System.out.print("");
        return new SrpNewInquiryForm(driver);
    }
    public void selectFromNavMenu(int index){
        MenuDropDown dropDown = new MenuDropDown(new ElementSelector.ById(menuId));
        dropDown.selectItemFromList(index).click();
    }
}
