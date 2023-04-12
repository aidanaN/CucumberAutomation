package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SupplySyncPage;
import utilities.Driver;
import utilities.Flow;

public class SupplySyncCompanyEdit_steps {

    SupplySyncPage supplySyncPage = new SupplySyncPage();

    @Given("user is on SupplySync application")
    public void user_is_on_supply_sync_application() {
        Driver.getDriver().get("https://supplysync.us");
        Flow.wait(1000);

    }
    @Then("user enters credentials {string} and {string} and clicks login in SupplySync")
    public void user_enters_credentials_and_and_clicks_login_in_supply_sync(String email, String password) {
        supplySyncPage.login.sendKeys(email);
        supplySyncPage.password.sendKeys(password);
        supplySyncPage.loginBtn.click();
        Flow.wait(2000);

    }

    @When("user clicks on three dot")
    public void user_clicks_on_three_dot() {
       supplySyncPage.threeDots.click();
       Flow.wait(2000);
    }
    @Then("user clicks on Edit button in SupplySync")
    public void user_clicks_on_edit_button_in_supply_sync() {
       supplySyncPage.editBtn.click();
       Flow.wait(2000);
    }

    @Then("user can edit company information")
    public void user_can_edit_company_information() {
        supplySyncPage.companyName.click();
        supplySyncPage.companyName.clear();
        supplySyncPage.companyName.sendKeys("Hello");
        supplySyncPage.companyEmail.click();
        supplySyncPage.companyEmail.clear();
        supplySyncPage.companyEmail.sendKeys("Hello");
        supplySyncPage.companyAddress.click();
        supplySyncPage.companyAddress.clear();
        supplySyncPage.companyAddress.sendKeys("Hello");
        supplySyncPage.companyName.click();
        supplySyncPage.companyName.clear();
        supplySyncPage.companyName.sendKeys("Hello");
        supplySyncPage.companyPhoneNumber.click();
        supplySyncPage.companyPhoneNumber.clear();
        supplySyncPage.companyPhoneNumber.sendKeys("456456456");
        supplySyncPage.saveButton.click();

    }




}
