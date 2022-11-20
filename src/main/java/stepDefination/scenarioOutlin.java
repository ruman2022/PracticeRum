//package stepDefination;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class signUpDefination {
//    WebDriver dr;
//    @Given("^User on alraedy home page$")
//    public void user_on_alraedy_home_page()  {
//        System.setProperty("webdriver.chrome.driver", "/Users/iftakerahmed/Downloads/chromedriver");
//        dr= new ChromeDriver();
//        dr.get("https://www.target.com/");
//        String title= dr.getTitle();
//        Assert.assertEquals("Target : Expect More. Pay Less.", title);
//
//        System.out.println(title);
//    }
//
//    @When("^user click on sign in$")
//    public void user_click_on_sign_in() throws InterruptedException {
//        Thread.sleep(3000);
//        dr.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
//
//    }
//
//    @Then("^click on create account$")
//    public void click_on_create_account() throws InterruptedException {
//        dr.findElement(By.xpath("//*[@id=\"listaccountNav-createAccount\"]")).click();
//        Thread.sleep(3000);
//
//    }
//
//
//    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and\"([^\"]*)\" and \"([^\"]*)\"$")
//    public void user_enters_and_and_and(String email, String firstname, String lastname, String password) throws InterruptedException {
//        dr.findElement(By.id("username")).sendKeys(email);
//        dr.findElement(By.id("firstname")).sendKeys(firstname);
//        dr.findElement(By.id("lastname")).sendKeys(lastname);
//        dr.findElement(By.id("password")).sendKeys(password);
//        Thread.sleep(2000);
//    }
//    @Then("^user click on create account$")
//    public void user_click_on_create_account() throws InterruptedException {
//
//        dr.findElement(By.id("createAccount")).click();
//        Thread.sleep(3000);
//    }
//
//    @Then("^user close the browser$")
//    public void user_close_the_browser()  {
//
//        dr.close();
//    }
//
//}
