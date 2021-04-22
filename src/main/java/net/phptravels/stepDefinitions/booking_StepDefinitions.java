package net.phptravels.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.phptravels.pages.LoginPage;
import net.phptravels.pages.bookingPage;
import net.phptravels.utilities.ConfigurationReader;
import net.phptravels.utilities.Driver;
import org.openqa.selenium.WebDriver;

public class booking_StepDefinitions {
    WebDriver driver;
    LoginPage loginPage= new LoginPage();

     @Given("User is on the landing page")
       public void user_is_on_the_landing_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @Given("User is logged in")
    public void user_is_logged_in() {
loginPage.login(ConfigurationReader.get("Email"),ConfigurationReader.get("Password"));




    }

    @When("User clicks hotel invoice button")
    public void user_clicks_hotel_invoice_button() {
bookingPage booking= new bookingPage();

    }

    @Then("User should see the booking status")
    public void user_sould_see_the_booking_status() {

    }




}
