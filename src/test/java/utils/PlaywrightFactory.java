package utils;

import com.microsoft.playwright.*;

public class PlaywrightFactory {

    public static Playwright initPlaywright() {
        return Playwright.create();
    }

    public static Browser launchBrowser(Playwright playwright) {
        return playwright.chromium().launch(
            new BrowserType.LaunchOptions().setHeadless(false)
        );
    }
}
//Central place for browser config
