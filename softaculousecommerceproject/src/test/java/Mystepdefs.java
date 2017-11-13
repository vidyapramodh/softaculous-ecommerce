
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Mystepdefs {

    public static WebDriver driver;

    @Before
    public void openBrowser() {

        System.out.println("opening the browser");
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demos1.softaculous.com/AbanteCart/");
    }

    @Given("^User is on Home page$")
    public void userIsOnHomePage() throws Throwable {
    }

    @When("^User enters in search bar \"([^\"]*)\"$")
    public void Userentersinsearchbar(String men) throws Throwable {
        driver.findElement(By.id("filter_keyword")).sendKeys(men);
    }

    @And("^User clicks on search button$")
    public void userClicksOnSearchButton() throws Throwable {
        driver.findElement(By.id("filter_keyword")).click();
    }

    @Then("^user should navigate to that page$")
    public void userShouldNavigateToThatPage() throws Throwable {
        driver.get("http://demos1.softaculous.com/AbanteCart/index.php?rt=product/search&keyword=men&category_id=0");
    }

    @Given("^user is on product detail page$")
    public void userIsOnProductDetailPage() throws Throwable {
        driver.get("http://demos1.softaculous.com/AbanteCart/");
    }

    @When("^User selects a product$")
    public void userSelectsAProduct() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[2]/div[2]")).click();
    }

    @And("^user clicks on add to cart$")
    public void userClicksOnAddToCart() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"product\"]/fieldset/div[4]/ul/li/a")).click();
    }

    @Then("^User should successfully add the product to his cart$")
    public void userShouldSuccessfullyAddTheProductToHisCart() throws Throwable {
    }

    @When("^User clicks on APPAREL & ACCESSORIES link$")
    public void userClicksOnAPPARELACCESSORIESLink() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[2]")).click();
    }

    @Then("^he should be landed on that page with text \"([^\"]*)\"$")
    public void heShouldBeLandedOnThatPageWithText(String text) throws Throwable {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(text));
    }

    @When("^User navigates back$")
    public void userNavigatesBack() throws Throwable {
        driver.navigate().back();
    }

    @When("^he clicks on Books link$")
    public void heClicksOnBooksLink() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[8]")).click();
    }

    @Then("^he should be landed on page with text \"([^\"]*)\"$")
    public void heShouldBeLandedOnPageWithText(String text) throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div[1]")).click();
    }

    @When("^user enters valid Email as\"([^\"]*)\"$")
    public void userEntersValidEmailAs(String Email) throws Throwable {
        driver.findElement(By.id("appendedInputButton")).sendKeys();
    }

    @And("^clicks on subscribe button$")
    public void clicksOnSubscribeButton() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"subscribeFrm\"]/div/span/button")).click();
    }

    @Then("^he should navigate to subscribe page successfully$")
    public void heShouldNavigateToSubscribePageSuccessfully() throws Throwable {

    }

    @When("^User looks for a Login or register is present$")
    public void userLooksForALoginOrRegisterIsPresent() throws Throwable {
    }

    @Then("^he should see the Login or register is on home page$")
    public void heShouldSeeTheLoginOrRegisterIsOnHomePage() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li")).getText().contains("Login or register"));
    }


    @When("^User clicks on Fragrance$")
    public void userClicksOnFragrance() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[5]")).click();
    }

    @And("^User navigates to Fragrance product page$")
    public void userNavigatesToFragranceProductPage() throws Throwable {

    }

    @And("^he clicks on Women$")
    public void heClicksOnWomen() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/ul/li[2]/div/a")).click();

    }

    @And("^user selects price High to Low$")
    public void userSelectsPriceHighToLow() throws Throwable {
        Select dropdown = new Select(driver.findElement(By.id("sort")));
        dropdown.selectByVisibleText("Price High > Low");
    }


    @Then("^User should see the products displayed from High to Low$")
    public void userShouldSeeTheProductsDisplayedFromHighToLow() throws Throwable {

    }

    @After
    public void closeBrowser() {

        driver.quit();
    }
}














