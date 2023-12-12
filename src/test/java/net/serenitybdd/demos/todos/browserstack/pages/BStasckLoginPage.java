package net.serenitybdd.demos.todos.browserstack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BStasckLoginPage extends PageObject {

    public static final Target USERNAME = Target.the("Username").located(By.cssSelector("#username input"));
    public static final Target PASSWORD = Target.the("Password").locatedBy("#password input");
    public static final Target LOGIN_BTN = Target.the("Login Button").locatedBy("#login-btn");


}
