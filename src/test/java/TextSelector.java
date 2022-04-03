import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class TextSelector {
    public static void main(String args[]){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://www.orangehrm.com/orangehrm-30-day-trial/?");
        // Text locator
//        page.locator("text=Contact Sales").click();

        // has text with html tag
        ////label[text()='Full Name']
//        page.locator("label:has-text('Full Name')").click();

        // parent html tag with class then and then child element
        page.locator("div.field text label:has-text('Full Name')").click();
        // here div is parent class field text is class name and label is the child
        System.out.println("done");
    }

}
