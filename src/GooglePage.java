import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;

public class GooglePage {
    private WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }

    public void googleFor(String searchTerm) {
        assertThat("On wrong page should have been:", driver.getCurrentUrl(), containsString("google"));
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(searchTerm);
        element.submit();
    }
}
