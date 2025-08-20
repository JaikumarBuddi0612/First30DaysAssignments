package Pages;

import Driver.Driver;
import org.openqa.selenium.By;

public class OverViewPage {
    private final By billPayLinkElement = By.linkText("Bill Pay");
    public void clickBillPayLink(){
        Driver.getDriver().findElement(billPayLinkElement).click();
    }
}
