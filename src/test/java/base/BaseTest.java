package base;

import com.microsoft.playwright.*;
import utils.PlaywrightFactory;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected Page page;

    public void setUp() {
        playwright = PlaywrightFactory.initPlaywright();
        browser = PlaywrightFactory.launchBrowser(playwright);
        page = browser.newPage();
    }

    public void tearDown() {
        browser.close();
        playwright.close();
    }
}

//Handles:Browser launch, Page initialization, Cleanup
