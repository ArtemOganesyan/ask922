package Definitions;

import cucumber.api.java.en.Given;

public class JavaStepDefs2 {
    @Given("I print Hello World!")
    public void iPrintHelloWorld() {
        System.out.println("Hello World!");
    }