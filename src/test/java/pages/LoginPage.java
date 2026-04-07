package pages;

import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    // Locators
    private String username = "#username";
    private String password = "#password";
    private String loginBtn = "text=Login";

    public LoginPage(Page page) {
        this.page = page;
    }

    public void navigate(String url) {
        page.navigate(url);
    }

    public void login(String user, String pass) {
        page.fill(username, user);
        page.fill(password, pass);
        page.click(loginBtn);
    }
}
