package selenium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SeleniumTest extends SeleniumTestBase {


    @Test
    public void shouldOpenGoogleWebsite() {
        getDriver().get("https://www.google.com/");
        assertEquals(getDriver().getCurrentUrl(), "https://www.google.com/");
    }

    @Test
    public void shouldOpenWpWebsiteAndFail() {
        getDriver().get("https://wp.pl/");
        assertEquals(2 > 5, true);
    }
}

