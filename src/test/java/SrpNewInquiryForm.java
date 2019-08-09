import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SrpNewInquiryForm extends Helper{
@FindBy(css = "h2.mainTitle")
private WebElement mainTitle;
@FindBy(id = "j_id0:theentireform:j_id27:j_id42:j_id43:opp__firstname")
private WebElement firstNameInput;
@FindBy (id = "j_id0:theentireform:j_id27:j_id42:j_id45:opp__lastname")
private WebElement lastNameInput;
@FindBy (id = "j_id0:theentireform:j_id27:j_id42:j_id47:campusPicklist")
private WebElement campusPick;
@FindBy (css = "iframe[title='accessibility title']")
private WebElement iframe;
@FindBy (id = "j_id0:theentireform:j_id27:j_id38:j_id39:opp__retrainowner")
private WebElement retainOwnerCbox;
@FindBy (id = "j_id0:theentireform:j_id27:j_id42:j_id51:programPicklist")
private WebElement programeDropDown;
@FindBy (id = "j_id0:theentireform:j_id27:j_id42:j_id55:specPicklist")
private WebElement specializatioDropDown;
@FindBy (id = "j_id0:theentireform:j_id27:j_id42:j_id51:programPanel")
private WebElement loadingTextPrograme;
@FindBy (id="j_id0:theentireform:j_id27:j_id42:j_id55:specPanel")
private WebElement loadingTextSpec;

private String campusDropDownId="j_id0:theentireform:j_id27:j_id42:j_id47:campusPicklist";
private String programeDropDwonId ="j_id0:theentireform:j_id27:j_id42:j_id51:programPicklist";
private String specializationDropDownId ="j_id0:theentireform:j_id27:j_id42:j_id55:specPicklist";

WebDriver driver;
    public SrpNewInquiryForm(WebDriver driver){
        this.driver= driver;
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
        lastNameInput.sendKeys(sName);
        return this;
    }

    public SrpNewInquiryForm selectCampus(String campusName){
        waitUntilElementVisible(campusPick);
        campusPick.click();
        DropDownSelector dropDownSelector = new DropDownSelector(new ElementSelector.ById(campusDropDownId));
        dropDownSelector.selectOption(campusName).click();
        campusPick.click();
        waitUntilElementDisappears(loadingTextPrograme);
        return this;
    }
    public SrpNewInquiryForm selectCampus(int index){
        waitUntilElementVisible(campusPick);
        campusPick.click();
        DropDownSelector dropDownSelector = new DropDownSelector(new ElementSelector.ById(campusDropDownId));
        dropDownSelector.selectOption(index).click();
        campusPick.click();
        waitUntilElementDisappears(loadingTextPrograme);
       return this;
    }
    public SrpNewInquiryForm checkRetainowner(){
       if (!retainOwnerCbox.isSelected()){
           retainOwnerCbox.click();
       }
        return this;
    }

    public SrpNewInquiryForm unCheckRetainowner(){
        if (retainOwnerCbox.isSelected()){
            retainOwnerCbox.click();
        }
        return this;
    }

    public SrpNewInquiryForm selectPrograme(String programeName){
        waitUntilElementVisible(programeDropDown);
        programeDropDown.click();
        DropDownSelector dropDownSelector = new DropDownSelector(new ElementSelector.ById(programeDropDwonId));
        dropDownSelector.selectOption(programeName).click();
        waitUntilElementDisappears(loadingTextSpec);
        return this;
    }
    public SrpNewInquiryForm selectPrograme(int index){
        waitUntilElementVisible(programeDropDown);
        programeDropDown.click();
        DropDownSelector dropDownSelector = new DropDownSelector(new ElementSelector.ById(programeDropDwonId));
        dropDownSelector.selectOption(index).click();
        waitUntilElementDisappears(loadingTextSpec);
        return this;
    }

    public SrpNewInquiryForm selectSpecialization(String programeName){
        waitUntilElementVisible(specializatioDropDown);
        specializatioDropDown.click();
        DropDownSelector dropDownSelector = new DropDownSelector(new ElementSelector.ById(programeDropDwonId));
        dropDownSelector.selectOption(programeName).click();
        programeDropDown.click();
        return this;
    }
    public SrpNewInquiryForm selectSpecialization(int index){
        waitUntilElementVisible(specializatioDropDown);
        specializatioDropDown.click();
        DropDownSelector dropDownSelector = new DropDownSelector(new ElementSelector.ById(specializationDropDownId));
        dropDownSelector.selectOption(index).click();
        return this;
    }

}
