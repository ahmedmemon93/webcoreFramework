import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SrpNewInquiryForm extends Helper{
@FindBy(css = "h2.mainTitle")
private WebElement mainTitle;
@FindBy(css = "input#j_id0:theentireform:j_id27:j_id42:j_id43:opp__firstname")
private WebElement firstNameInput;
@FindBy (css = "input#j_id0:theentireform:j_id27:j_id42:j_id45:opp__lastname")
private WebElement lastNameInput;
@FindBy (css = "select#j_id0:theentireform:j_id27:j_id42:j_id47:campusPicklist")
private WebElement campusPick;
@FindBy (name = "vfFrameId_1565076333953")
private WebElement iframe;

    public SrpNewInquiryForm(WebDriver driver){
        PageFactory.initElements(driver,this);
        driver.switchTo().frame(iframe);
        waitUntilElementVisible(mainTitle);
    }

    public SrpNewInquiryForm verifyFormTitle(){
        Assert.assertEquals("New Inquiry Form",mainTitle.getText());
        return this;
    }

    public SrpNewInquiryForm enterFirstName(String fName){
        firstNameInput.sendKeys(fName);
        return this;
    }

    public SrpNewInquiryForm enterSecondName(String sName){
        firstNameInput.sendKeys(sName);
        return this;
    }

    public SrpNewInquiryForm selectCampus(String campusName){
        campusPick.click();
        return this;
    }
    public SrpNewInquiryForm selectCampus(int index){

       return this;
    }
}
