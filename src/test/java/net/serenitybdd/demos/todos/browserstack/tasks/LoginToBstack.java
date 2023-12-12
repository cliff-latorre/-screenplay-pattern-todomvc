package net.serenitybdd.demos.todos.browserstack.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.demos.todos.browserstack.pages.BStasckLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class LoginToBstack implements Task {

    private String username;

    private String password;



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(username).into(BStasckLoginPage.USERNAME).thenHit(Keys.TAB));
        actor.attemptsTo(Enter.theValue(password).into(BStasckLoginPage.PASSWORD).thenHit(Keys.TAB));
        actor.attemptsTo(Click.on(BStasckLoginPage.LOGIN_BTN));
    }

    public LoginToBstack(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static Task withCredentials(String username, String password){
        return Instrumented.instanceOf(LoginToBstack.class).withProperties(username, password);
    }

}
