import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandling {
    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("http://londonfreelance.org/courses/frames/index.html");
        // in frame locator we have to use the css of frame
        String header = page.frameLocator("frame[name='main']").locator("h2").textContent();
        // or using frame name
//        String header = page.frame("main").locator("h2").textContent();
        // or frame locator with xpath
//        String header = page.frameLocator("//frame[name='main']").locator("h2").textContent();
        System.out.println(header);
    }
}
