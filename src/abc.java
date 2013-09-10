import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class abc {

    private WebDriver driver;
    private GooglePage page;

    @Before
    public void setUp() {
       // WebDriver driver = new HtmlUnitDriver();
        driver = new FirefoxDriver();
        driver.get("http://www.google.co.uk/");
        page = new GooglePage(driver);

    }

    @After
    public void afterTest()  {
         driver.quit();

    }

    @Test
    public  void searchTest()    {

        page.googleFor("Cheese!");
        assertThat(driver.getTitle(), is("Google"));
    }


}
