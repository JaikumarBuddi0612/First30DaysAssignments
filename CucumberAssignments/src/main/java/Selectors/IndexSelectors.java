package Selectors;

import org.openqa.selenium.By;

public class IndexSelectors {
    private final By registerLinkIndexPageElement = By.linkText("Register");
    private final By userNameInputElement = By.cssSelector("input[name='username']");
    private final By passwordInputElement = By.cssSelector("input[name='password']");
    private final By loginButtonElement = By.cssSelector("input[value='Log In']");
    private final By forgotLoginElement = By.linkText("Forgot login info?");

    public By getRegisterLinkIndexPageElement() {
        return registerLinkIndexPageElement;
    }

    public By getUserNameInputElement() {
        return userNameInputElement;
    }

    public By getPasswordInputElement() {
        return passwordInputElement;
    }

    public By getLoginButtonElement() {
        return loginButtonElement;
    }

    public By getForgotLoginElement() {
        return forgotLoginElement;
    }
}
