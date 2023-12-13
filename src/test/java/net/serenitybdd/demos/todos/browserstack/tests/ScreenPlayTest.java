package net.serenitybdd.demos.todos.browserstack.tests;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.demos.todos.browserstack.model.DashboardInformation;
import net.serenitybdd.demos.todos.browserstack.questions.Dashboard;
import net.serenitybdd.demos.todos.browserstack.tasks.LoginToBstack;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.matchers.ConsequenceMatchers.displays;
import static org.hamcrest.Matchers.equalTo;

@ExtendWith(SerenityJUnit5Extension.class)
public class ScreenPlayTest {

    private Actor demoUser = Actor.named("Demo User");

    @Managed
    private WebDriver hisBrowser;

    @BeforeEach
    public void demoUserCanBrowseTheWeb() {
        demoUser.can(BrowseTheWeb.with(hisBrowser));
    }


    @Test
    public void browseTheWebAsDemoUser() {
        demoUser.attemptsTo(Open.url("https://bstackdemo.com/signin"));
        givenThat(demoUser).attemptsTo(LoginToBstack.withCredentials("demouser", "testingisfun99"));

        then(demoUser).should(
                seeThat(Dashboard.information(),
                        displays("title", equalTo("StackDemo")),
                        displays("bag", equalTo("0")),
                        displays("userLogued", equalTo("demouser"))
                            )
                );
    }


}
