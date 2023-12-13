package net.serenitybdd.demos.todos.browserstack.questions;

import net.serenitybdd.demos.todos.browserstack.model.DashboardInformation;
import net.serenitybdd.demos.todos.browserstack.pages.BStackDashboardPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

public class Dashboard implements Question<DashboardInformation> {
    @Override
    public DashboardInformation answeredBy(Actor actor) {
        String title = BrowseTheWeb.as(actor).getTitle();
        String bag = Text.of(BStackDashboardPage.BAG).answeredBy(actor);
        String userLogued = Text.of(BStackDashboardPage.SIGNOUT).answeredBy(actor);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new DashboardInformation(title,bag,userLogued);
    }


    public static Dashboard information(){
        return new Dashboard();
    }
}
