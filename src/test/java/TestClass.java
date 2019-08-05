import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import java.beans.MethodDescriptor;
import java.lang.reflect.Method;

public class TestClass extends BrowserSetup{
    public Logger logger = Logger.getLogger(TestClass.class);
    @Test
    public void testCase1(){
       // Method method = M;
        logger.info("test case 1");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserName().enterPwd().clickLoginBtn();
        logger.info("test case 1");
    }
}
