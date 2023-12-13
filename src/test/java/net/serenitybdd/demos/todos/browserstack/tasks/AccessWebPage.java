package net.serenitybdd.demos.todos.browserstack.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.demos.todos.browserstack.pages.BStasckLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AccessWebPage implements Task {

    BStasckLoginPage loginPage;

   public static AccessWebPage loginPage(){
       return instrumented(AccessWebPage.class);
   }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn().the(loginPage));
    }



}
