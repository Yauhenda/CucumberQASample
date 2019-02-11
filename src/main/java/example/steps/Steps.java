package example.steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import example.driver.DriverSingleton;
import example.pages.YouTubePage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Steps {

    private final WebDriver driver = DriverSingleton.getDriver();
    private YouTubePage youTubePage;

    public Steps() {
        this.youTubePage = new YouTubePage(driver);
    }

//    @Before
//    public void beforeScenario() {
//        Screenshoter.initialize(DriverSingleton.getDriver());
//    }
//
//    @After
//    public void afterScenario(Scenario scenario) {
//        Screenshoter.initialize(null);
//    }

//    @After
//    public void afterScenario2(Scenario scenario) {
//        System.out.println("dgfdsgg");
//    }

    @Given("^I am on page with url '([^\\\"]*)'$")
    public void givenIAmOnPage(String pageUrl) {
        youTubePage.open(pageUrl);
    }

    @Then("^I should see author name '([^\\\"]*)'$")
    public void thenIShouldSeeAuthorName(String expectedAuthorName) {
        String actualAuthorName = youTubePage.getAuthorName();
        System.out.println("[expected: '" + expectedAuthorName + "'][actual: '" + actualAuthorName + "']");
        Assert.assertEquals(expectedAuthorName, actualAuthorName);
    }

    @Then("^I should see '([^\\\"]*)' in list video$")
    public void thenIShouldSeeVideoTitle(String expectedVideoTitle) {
        String actualVideoTitle = youTubePage.getVideoInList();
        System.out.println("[expected: '" + expectedVideoTitle + "'][actual: '" + actualVideoTitle + "']");
        Assert.assertEquals(expectedVideoTitle, actualVideoTitle);
    }

    @Then("^I should see channel title '([^\\\"]*)'$")
    public void thenIShouldSeeInTitle(String expectedChannelTitle) {
        String actualChannelTitle = youTubePage.getChannelTitle();
        System.out.println("[expected: '" + expectedChannelTitle +"'][actual: '" + actualChannelTitle + "']");
        Assert.assertEquals(expectedChannelTitle, actualChannelTitle);
    }
}