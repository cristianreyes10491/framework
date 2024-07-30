package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class definitionssteps {

    public void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome.exe");

     }


        @Given("I am the main page")
        public void iAmTheMainPage() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://automationexercise.com/login");
        }

        @When("I am in the login page")
        public void i_am_in_the_login_page(){

        }

        @And("Type my user and my pass for test {string}")
        public void typeMyUserAndMyPassForTest(String arg0) {
        }

        @Then("The main page should be open")
        public void theMainPageShouldBeOpen() {
        }
}
