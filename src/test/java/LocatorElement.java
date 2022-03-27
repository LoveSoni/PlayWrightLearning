import com.microsoft.playwright.*;

public class LocatorElement {
    public static void main(String args[]){
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext browserContext = browser.newContext();
        Page page = browserContext.newPage();
        page.navigate("https://www.orangehrm.com/");

        // locate single element
        Locator locator = page.locator("text = CONTACT SALES");
        locator.hover();// optional
        locator.click();

        //locate multiple elements
// for first and last element:
        //  Locator locator = page.locator("class = btn-orange contact-ohrm").first();
        page.navigate("https://www.orangehrm.com/hris-hr-software-demo/");
        //print entire list
        Locator locator1 = page.locator("select#Form_submitForm_Country option");
        for(int i=0;i<locator1.count();i++){
            System.out.println(locator1.nth(i).textContent());
        }
        page.close();
        playwright.close();
    }
}
