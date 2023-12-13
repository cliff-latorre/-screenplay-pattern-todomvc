package net.serenitybdd.demos.todos.browserstack.model;

public class DashboardInformation {

    private final String title;
    private final String bag;
    private final String userLogued;

    public DashboardInformation(String title, String bag, String userLogued) {
        this.title = title;
        this.bag = bag;
        this.userLogued = userLogued;
    }

    public String getTitle() {
        return title;
    }

    public String getBag() {
        return bag;
    }

    public String getUserLogued() {
        return userLogued;
    }
}
