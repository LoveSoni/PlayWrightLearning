import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ShadomDomElement {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        // Element could be available in these different forms
        // Page -> DOM -> Shadow DOM -> elements


        //To handle shadow elements direcly nagive to parent tag and then use child element locator
//        page.navigate("https://books-pwakit.appspot.com/");
//        page.locator("book-app[apptitle='BOOKS'] #input").fill("automated tests");

        // Page -> DOM -> iFrame -> Shadow DOM -> elements
    }
}
