package net.serenitybdd.demos.todos.browserstack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BStackDashboardPage extends PageObject {


    public static final Target SIGNOUT = Target.the("sign out").locatedBy(".username");
    public static final Target BAG = Target.the("Password").locatedBy("//span[@class='bag__quantity']");



}
