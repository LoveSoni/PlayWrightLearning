import com.microsoft.playwright.*;

public class BrowserContextConcept {
    public static void main(String[] args) {
       Playwright playwright = Playwright.create();
       Browser browser =  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
       // create 1st context, create new page and open any application
       BrowserContext browserContext1 = browser.newContext();
       Page page1 = browserContext1.newPage();
        page1.navigate("https://www.google.com");
       System.out.println("Title from first context"+page1.title());
        try{
           Thread.sleep(5000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }

    // creating 2nd context
        BrowserContext browserContext2 = browser.newContext();
        Page page2 = browserContext2.newPage();
        page2.navigate("https://www.facebook.com");
        System.out.println("Title from 2nd context"+page2.title());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        // close contexts
//        browserContext1.close();
//        browserContext1.close();
//        playwright.close();
    }
}
