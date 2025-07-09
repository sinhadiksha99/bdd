package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforeValidation() {
        System.out.println("This will run before MobileTest");
    }

    @After("@MobileTest")
    public void afterValidation() {
        System.out.println("This will run after MobileTest");
    }

    @Before("@WebTest")
    public void beforeWebValidation() {
        System.out.println("This will run before WebTest");
    }

    @After("@WebTest")
    public void afterWebValidation() {
        System.out.println("This will run after WebTest");
    }

}
