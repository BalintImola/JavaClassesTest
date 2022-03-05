package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.fail;

public class EbayHome_Steps {
    WebDriver driver=new Environment().getDriver();
    public EbayHome_Steps(){}
    @Given("I am on Ebay home page")
    public void I_am_on_Ebay_home_page() throws InterruptedException {
    driver.get("https://www.ebay.com/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    Thread.sleep(1000);


    }
    @When("I click on Advance link")
    public void I_click_on_advance_link() throws InterruptedException {driver.findElement(By.linkText("Advanced")).click();
        Thread.sleep(1000);
    }


    @Then("I navigate to the advance home page")
    public void I_navigate_to_the_advance_home_page(){
        String expurl="https://www.ebay.com/sch/ebayadvsearch";
        String acturl=driver.getCurrentUrl();
        if (expurl.equals(acturl)){
            System.out.println("test has passed");
        }
        else {
            fail("page dose not navigate expected link");
        }
    }
}