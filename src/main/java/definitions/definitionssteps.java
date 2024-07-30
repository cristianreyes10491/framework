package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class definitionssteps {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chrome.exe");

        WebDriver driver = new ChromeDriver();


        @Given("I am the main page")
        public void iAmTheMainPage() {

            driver.get("https://automationexercise.com/login");
        }

        @When("I am in the login page")
        public void i_am_in_the_login_page(){

        }

        public void iAmInTheLoginPage () {
        }

        public void typeMyUserAndMyPassForTest (String arg0) throws Throwable {
            // Write code here that turns the phrase above into concrete actions
            throw new cucumber.api.PendingException();
        }


    }
}