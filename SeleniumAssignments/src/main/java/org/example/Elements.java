package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Elements {
    private static ChromeDriver driver = Driver.getDriver();
    public void textBox(){
        driver.navigate().to("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector("#userName")).sendKeys("Jaikumar");
        driver.findElement(By.cssSelector("#userEmail")).sendKeys("Jaikumar@gmail.com");
        driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Hitex city, Hyderabad");
        driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Eluru, Andhrapradesh");
        driver.findElement(By.cssSelector("#submit")).click();
        driver.close();
    }
    public void checkBox(){
        driver.navigate().to("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
        driver.findElement(By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']")).click();
        driver.findElement(By.cssSelector("label[for='tree-node-home'] span[class='rct-checkbox'] svg")).click();
        driver.close();
    }
    public void RadioButton(){
        driver.navigate().to("https://demoqa.com/radio-button");
        driver.findElement(By.cssSelector("label[for='yesRadio']")).click();
        driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
        driver.close();
    }
    public void webTables(){
        driver.navigate().to("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("jaikumar");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Buddi");
        driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("Jaikumar@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Age']")).sendKeys("23");
        driver.findElement(By.cssSelector("input[placeholder='Salary']")).sendKeys("1100000");
        driver.findElement(By.cssSelector("input[placeholder='Department']")).sendKeys("Renditions");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        driver.close();
    }
    public void buttons(){
        driver.navigate().to("https://demoqa.com/buttons");
        Actions actions = new Actions(driver);
        actions.doubleClick(driver.findElement(By.xpath("//button[text()='Double Click Me']"))).perform();
        actions.contextClick(driver.findElement(By.cssSelector("button#rightClickBtn"))).perform();
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
    }
    public void links(){
        driver.navigate().to("https://demoqa.com/links");
        driver.findElement(By.linkText("Home")).click();
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        WebElement element = driver.findElement(By.cssSelector("a#dynamicLink"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();",element);
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.cssSelector("#created")).click();
        driver.findElement(By.cssSelector("#no-content")).click();
        driver.findElement(By.cssSelector("#moved")).click();
        driver.findElement(By.cssSelector("#bad-request")).click();
        driver.findElement(By.cssSelector("#unauthorized")).click();
        driver.findElement(By.cssSelector("#forbidden")).click();
        driver.findElement(By.cssSelector("#invalid-url")).click();
        driver.close();
    }
    public void uploadAndDownload(){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.xpath("//a[text()='Download']")).click();
        driver.findElement(By.cssSelector("#uploadFile")).sendKeys("/Users/JaiBuddi/Downloads/sampleFile.jpeg");
        driver.close();
    }
    public void practiceForm(){
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Jaikumar");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Jaikumar");
        driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("Jaikumar@gmail.com");
        WebElement element = driver.findElement(By.cssSelector("input[name='gender'][value='Male']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234567890");
//        driver.findElement(By.cssSelector("#dateOfBirthInput")).clear();
//        driver.findElement(By.cssSelector("#dateOfBirthInput")).sendKeys("06 Apr 2002");
//        driver.findElement(By.cssSelector("input[type='file']")).sendKeys("/Users/JaiBuddi/Downloads/sampleFile.jpeg");
        driver.findElement(By.cssSelector("textarea[placeholder='Current Address']")).sendKeys("HitexCity, Hyderabad");
        driver.findElement(By.cssSelector("div#subjectsContainer")).click();
        driver.findElement(By.cssSelector("input#subjectsInput")).sendKeys("maths");
        driver.findElement(By.cssSelector("input#subjectsInput")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("input#subjectsInput")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("button#submit")).click();
        driver.close();
    }
    public void browserWindows(){
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.cssSelector("button#windowButton")).click();
        driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
        driver.close();
    }
    public void alerts() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.cssSelector("button#alertButton")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        driver.findElement(By.cssSelector("button#confirmButton")).click();
        if(Objects.equals(driver.switchTo().alert().getText(), "Do you confirm this action")){
            driver.switchTo().alert().accept();
        }
        else{
            driver.switchTo().alert().dismiss();
        }
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        driver.switchTo().alert().sendKeys("jaikumar");
        driver.switchTo().alert().accept();
        driver.close();
    }
    public void frames(){
        driver.navigate().to("https://demoqa.com/frames");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#frame1")));
        System.out.println(driver.getPageSource());
        driver.switchTo().parentFrame();
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#frame2")));
        System.out.println(driver.getPageSource());
        driver.close();
    }
    public void nestedFrame(){
        driver.navigate().to("https://demoqa.com/nestedframes");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#frame1")));
        System.out.println(driver.getPageSource());
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']")));
        System.out.println(driver.getPageSource());
    }
    public void modalDialogs(){
        driver.navigate().to("https://demoqa.com/modal-dialogs");
        driver.findElement(By.cssSelector("button#showSmallModal")).click();
        WebElement modalContainer = driver.findElement(By.className("modal-content"));
        System.out.println(modalContainer.findElement(By.className("modal-body")).getText());
        modalContainer.findElement(By.cssSelector("button#closeSmallModal")).click();
        driver.findElement(By.cssSelector("button#showLargeModal")).click();
        WebElement largeModalContainer = driver.findElement(By.className("modal-content"));
        System.out.println(largeModalContainer.findElement(By.tagName("p")).getText());
        largeModalContainer.findElement(By.cssSelector("button#closeLargeModal")).click();
        driver.close();
    }
    public void accordian(){
        driver.navigate().to("https://demoqa.com/accordian");
        driver.findElement(By.cssSelector("div#section1Heading")).click();
        driver.findElement(By.cssSelector("div#section2Heading")).click();
        driver.findElement(By.cssSelector("div#section3Heading")).click();
        driver.close();
    }
    public void autoComplete(){
        driver.navigate().to("https://demoqa.com/auto-complete");
        driver.findElement(By.cssSelector("div#autoCompleteMultipleContainer")).click();
        driver.findElement(By.cssSelector("input#autoCompleteMultipleInput")).sendKeys("purple");
        driver.findElement(By.cssSelector("input#autoCompleteMultipleInput")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("input#autoCompleteMultipleInput")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input#autoCompleteMultipleInput")).sendKeys("black");
        driver.findElement(By.cssSelector("input#autoCompleteMultipleInput")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.cssSelector("input#autoCompleteMultipleInput")).sendKeys(Keys.ENTER);
        driver.close();
    }
    public void slider(){
        driver.navigate().to("https://demoqa.com/slider");
        WebElement element = driver.findElement(By.cssSelector("input[type='range']"));
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(element,25,0).build().perform();
    }
    public void menu(){
        driver.navigate().to("https://demoqa.com/menu");
        Actions action = new Actions(driver);
        WebElement main2 = driver.findElement(By.cssSelector("#nav > li:nth-child(2)"));
        action.moveToElement(main2).perform();
        WebElement sub = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3)"));
        action.moveToElement(sub).perform();
        WebElement item = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1)"));
        action.moveToElement(item).click().perform();
        driver.close();
    }
    public void selectMenu(){
        driver.navigate().to("https://demoqa.com/select-menu");
        driver.findElement(By.cssSelector("div#withOptGroup")).click();
        driver.findElement(By.cssSelector("input[id='react-select-2-input']")).sendKeys("group 1, option 2");
        driver.findElement(By.cssSelector("input#react-select-2-input")).sendKeys(Keys.ENTER);
        driver.close();
    }
    public void sortable(){
        driver.navigate().to("https://demoqa.com/sortable");
        WebElement one= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(1)"));
        WebElement two= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(2)"));
        WebElement three= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(3)"));
        WebElement four= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(4)"));
        WebElement five= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(5)"));
        WebElement six= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(6)"));
        Actions action = new Actions(driver);
        action.dragAndDrop(one,six).perform();
        action.dragAndDrop(two,six).perform();
        action.dragAndDrop(three,six).perform();
        action.dragAndDrop(four,six).perform();
        action.dragAndDrop(five,six).perform();
        driver.close();
    }
    public void resizable(){
        driver.navigate().to("https://demoqa.com/resizable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement ele = driver.findElement(By.cssSelector("div#resizableBoxWithRestriction span.react-resizable-handle.react-resizable-handle-se"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(ele).moveByOffset(30,20).perform();
        driver.close();
    }
//    public void scenorio1() throws InterruptedException {
//        driver.navigate().to("https://www.nba.com/warriors/");
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
//
//        // Wait for full page load
//        wait.until(driver -> ((JavascriptExecutor) driver)
//                .executeScript("return document.readyState").equals("complete"));
//        driver.findElement(By.cssSelector("div.p-2.absolute.right-3.hover\\:cursor-pointer")).click();
//        WebElement shop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Shop']")));
//        shop.click();
//        wait.until(driver -> ((JavascriptExecutor) driver)
//                .executeScript("return document.readyState").equals("complete"));
//        WebElement men = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-trk-id='topnav-group-ga-1_men']")));
//        men.click();
////        driver.findElement(By.xpath("")).click();
//        driver.findElement(By.xpath("//span[text()='Hats']")).click();
//        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-s-sizes-82']")).click();
//        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-bucket-departments-15638']")).click();
//        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-activewear-product-groups-11044']")).click();
//        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-new-era-brands-127']")).click();
//        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-40-to-60-price-ranges-4']")).click();
//        driver.close();
//    }

public void scenario1() throws InterruptedException, IOException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    // Navigate to the Warriors homepage
    driver.navigate().to("https://www.nba.com/warriors/");

    // Wait for full page load
    wait.until(webDriver -> ((JavascriptExecutor) webDriver)
            .executeScript("return document.readyState").equals("complete"));

    // Try to close the initial popup
    try {
        driver.findElement(By.cssSelector("div.p-2.absolute.right-3.hover\\:cursor-pointer")).click();
    } catch (NoSuchElementException ignored) {
        System.out.println("Initial popup not found.");
    }

    // Click the Shop button (opens new tab)
    WebElement shop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Shop']")));
    shop.click();

//     Switch to the newly opened tab
    String originalWindow = driver.getWindowHandle();
    for (String handle : driver.getWindowHandles()) {
        if (!handle.equals(originalWindow)) {
            driver.switchTo().window(handle);
            break;
        }
    }

    // Wait for popup in new tab to vanish (approx. 16 sec)
    Thread.sleep(16000);

    // Retry clicking the "Men" tab (handle possible overlay)
    boolean clicked = false;
    int retries = 0;
    while (!clicked && retries < 5) {
        try {
            WebElement men = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[@data-trk-id='topnav-group-ga-1_men']")));
            men.click();
            clicked = true;
        } catch (Exception e) {
            System.out.println("Popup may still be blocking. Retrying... (" + (retries + 1) + ")");
            Thread.sleep(4000);
            retries++;
        }
    }

    if (!clicked) {
        throw new RuntimeException("Failed to click 'Men' after multiple retries.");
    }
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Hats']"))).click();
    driver.findElement(By.cssSelector("a[data-trk-id='side-nav-s-sizes-82']")).click();
    driver.findElement(By.cssSelector("a[data-trk-id='side-nav-bucket-departments-15638']")).click();
    driver.findElement(By.cssSelector("a[data-trk-id='side-nav-activewear-product-groups-11044']")).click();
    driver.findElement(By.cssSelector("a[data-trk-id='side-nav-new-era-brands-127']")).click();
    driver.findElement(By.cssSelector("a[data-trk-id='side-nav-40-to-60-price-ranges-4']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.product-card")));
    List<WebElement> productCards = driver.findElements(By.cssSelector("div.product-card"));
    System.out.println("Total Products Found: " + productCards.size());
    for (WebElement card : productCards) {
        try {
            // Extract title
            WebElement titleElement = card.findElement(By.cssSelector("div.product-card-title a"));
            String productTitle = titleElement.getAttribute("title");

            // Extract price
            WebElement priceElement = card.findElement(By.cssSelector("span.money-value"));
            String productPrice = priceElement.getText();

            System.out.println("Title: " + productTitle);
            System.out.println("Price: " + productPrice);
            System.out.println("----------------------------");

        } catch (NoSuchElementException e) {
            System.out.println("Product missing title or price.");
        }
    }

}
public void classAttribute(){
    driver.navigate().to("http://www.uitestingplayground.com/classattr");
    try{
        for(int i=1;i<=3;i++){
            String s="button.btn.class"+Integer.toString(i)+".btn-primary.btn-test";
            driver.findElement(By.cssSelector(s)).click();
            System.out.println("primary button is " +i);
        }
    }
    catch (Exception e){

    }
//    driver.findElement(By.cssSelector("button.btn.class3.btn-primary.btn-test")).click();
    driver.switchTo().alert().accept();
    driver.close();
}
public void ajaxRequest(){
    driver.navigate().to("http://www.uitestingplayground.com/ajax");
    driver.findElement(By.cssSelector("button#ajaxButton")).click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
    WebElement successMessage = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content p.bg-success"))
    );
    System.out.println(successMessage.getText());
    driver.close();
}
public void clickButton(){
    driver.navigate().to("http://www.uitestingplayground.com/click");
    WebElement element = driver.findElement(By.cssSelector("button#badButton"));
    String oldClass= element.getAttribute("class");
    element.click();
//    System.out.println(oldClass);
    String newClass= element.getAttribute("class");
//    System.out.println(newClass);
    if(oldClass.equals(newClass)){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
}
    public void google(){
        driver.navigate().to("https://www.google.com/");
        Actions actions = new Actions(driver);
        WebElement mice = driver.findElement(By.cssSelector("svg.goxjub"));
        actions.moveToElement(mice).perform();
        WebElement parentElement = mice.findElement(By.xpath(".."));
        System.out.println(parentElement.getAttribute("aria-label"));
        WebElement img = driver.findElement(By.cssSelector("svg.Gdd5U"));
        actions.moveToElement(img).perform();
        parentElement = img.findElement(By.xpath(".."));
        System.out.println(parentElement.getAttribute("aria-label"));
        driver.close();
    }
}
