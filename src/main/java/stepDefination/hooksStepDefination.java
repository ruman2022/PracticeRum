package stepDefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class hooksStepDefination {

    //make sure import it from cucumber.api.java.After; not junit
    @Before
    public void setUp(){
        System.out.println("openning browser");
    }
    //make sure import it from cucumber.api.java.After; not junit
    @After
    public void tearDown(){
        System.out.println("close browser");
    }


    @Given("^User on alraedy home page$")
    public void user_on_alraedy_home_page() {
        System.out.println("homepage");
    }

    @When("^user click on sign in$")
    public void user_click_on_sign_in()  {
        System.out.println("sign in");

    }

    @Then("^click on create account$")
    public void click_on_create_account()  {
        System.out.println("create account");
    }
}
