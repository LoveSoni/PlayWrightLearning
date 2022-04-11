import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ParentChildConcept {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser  = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
        System.out.println("Printing all inner texts");
        // That we can crete parent child locators
        System.out.println(page.locator("select#Form_submitForm_Country:has(option[value='India'])").allInnerTexts());
        System.out.println("Printing all text contents");
        System.out.println(page.locator("select#Form_submitForm_Country:has(option[value='India'])").allTextContents());
    }
}
