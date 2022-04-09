import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import java.util.List;

public class SelectingVisibleElements {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
//        page.navigate("");

        // now if we want to click on a button based on visibility
//        page.locator("button:visible").click();

        //Scenario
        // navigate to amazon.com and get link of all visible elements
        page.navigate("https://www.amazon.com");
        List<String> innerTexts = page.locator("a:visible").allInnerTexts();
        innerTexts.stream().forEach( x-> System.out.println(x));
    }
}
