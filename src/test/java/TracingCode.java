import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class TracingCode {
    public static void main(String[] args) {
        Playwright playwright =  Playwright.create();
        Browser browser =  playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext();
// Start tracing before creating / navigating a page.
        context.tracing().start(new Tracing.StartOptions()
                .setScreenshots(true)
                .setSnapshots(true));
        Page page =context.newPage();
        page.navigate("https://www.google.com");
        System.out.println(page.title());
        page.type("input[name='q']","love soni");
        page.click("//input[@name='btnK']");
        page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
        // Stop tracing and export it into a zip archive.
        context.tracing().stop(new Tracing.StopOptions()
                .setPath(Paths.get("trace.zip")));
        browser.close();
        playwright.close();
    }
}
