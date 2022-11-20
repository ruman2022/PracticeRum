//package stepDefination;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.List;
//
//public class dataTableDefination {
//
//    WebDriver dr;
//    @Given("^User on alraedy home page$")
//    public void user_on_alraedy_home_page()  {
//        System.setProperty("webdriver.chrome.driver", "/Users/iftakerahmed/Downloads/chromedriver");
//         dr= new ChromeDriver();
//         dr.get("https://www.facebook.com/");
//         String title= dr.getTitle();
//    }
//
//    @Then("^user enters email and password$")
//    public void user_enters_email_and_password(DataTable data)  {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        List<List<String>> name=data.raw();
//
//        dr.findElement(By.id("email")).sendKeys(name.get(0).get(0));
//        dr.findElement(By.id("pass")).sendKeys(name.get(0).get(1));
//
//    }
//
//    @Then("^user click on login button$")
//    public void user_click_on_login_button()  {
//
//        dr.findElement(By.name("login")).click();
//    }
//
//    @Then("^user close the browser$")
//    public void user_close_the_browser()  {
//        dr.close();
//
//    }
//
//
//
//}
