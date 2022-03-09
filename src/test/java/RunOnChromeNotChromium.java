import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RunOnChromeNotChromium {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions  = new BrowserType.LaunchOptions();
        //use chrome channel
        launchOptions.setChannel("chrome");
        launchOptions.setHeadless(false);
        Browser browser = playwright.chromium().launch(launchOptions);
        Page page = browser.newPage();
        page.navigate("https://www.google.com");
        browser.close();
        playwright.close();
    }
}
