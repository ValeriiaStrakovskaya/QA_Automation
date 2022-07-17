import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {
    WebDriver wd;

    @BeforeMethod
    public void preCondition(){
WebDriverManager.chromedriver().setup();
wd =  new ChromeDriver();
wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
//wd.navigate().forward();
//wd.navigate().back();
//wd.navigate().refresh();
    }

    @Test
    public void testName(){
//        WebElement element =wd.findElement(By.cssSelector("div[class = navbar-component_nav__1X_4m] [href=\"/about\"]"));
//        element.click();
//        wd.navigate().back();
//        element =wd.findElement(By.cssSelector("div[class = navbar-component_nav__1X_4m] [href=\"/home\"]"));
//        element.click();
//        wd.navigate().back();
//         element =wd.findElement(By.cssSelector("input[placeholder='Email']"));
//        element.click();
//        element =wd.findElement(By.cssSelector("input[placeholder='Password']"));
//        element.click();
//        // element= wd.findElement(By.xpath("//button[text()=' Login']"));
//       // element.click();
//        element= wd.findElement(By.xpath("//button[last()]"));
//        element.click();
//

        //HW Task2
        WebElement element =wd.findElement(By.xpath("//a[@href='/about']"));
       // element =wd.findElement(By.xpath("//a[contains(text(),'ABOUT')]"));
        element.click();
        wd.navigate().back();
        element =wd.findElement(By.xpath("//a[@href='/home']"));
       // element =wd.findElement(By.xpath("//a[contains(text(),'HOME')]"));
        element.click();
        wd.navigate().back();
        element =wd.findElement(By.xpath("//*[@placeholder='Email']"));
      //  element =wd.findElement(By.xpath("//input[@placeholder='Email']"));
      //  element =wd.findElement(By.xpath("//input[position()=1]"));
        element.click();
        element =wd.findElement(By.xpath("//*[@placeholder='Password']"));
       // element =wd.findElement(By.xpath("//input[last()]"));
        element.click();
        element= wd.findElement(By.xpath("//button[2]"));
      //  element= wd.findElement(By.xpath("//button[text()=' Registration']"));
      //  element= wd.findElement(By.xpath("//button[last()]"));
        element.click();





        // List<WebElement> elements = wd.findElements(By.tagName("div"));
       // System.out.println(elements.size());
        //strategies
       // element= wd.findElement(By.linkText("ABOUT"));//old school
       // element= wd.findElement(By.partialLinkText("ABO"));//old school
       // element= wd.findElement(By.id("root"));
       // element= wd.findElement(By.className("container"));

        //cssSelector
       // element= wd.findElement(By.cssSelector("div"));
      //  element= wd.findElement(By.className(".container"));
       // element= wd.findElement(By.className("#root"));
        // by attribute
       // element= wd.findElement(By.className("[placeholder='Email']"));
        // by attribute starts with
       // element= wd.findElement(By.className("[href^='Ho']"));
        // by attribute ends with
       // element= wd.findElement(By.className("[href$='out']"));
        //by attribute contains
      //  element= wd.findElement(By.className("[href*='ogi']"));

        //xPath selectors:
        //by tagname
        // element= wd.findElement(By.xpath("//div"));
        //by classname
        //  element= wd.findElement(By.xpath("//*[@class ='container']"));
        //by id
        // element= wd.findElement(By.xpath("//*[@id ='root']");
        // by attribute
        // element= wd.findElement(By.xpath("//*[@placeholder='Email']"));
        // by attribute starts with
        // element= wd.findElement(By.xpath("//*[starts-with(@href,'/Ho')]"));
        // by attribute ends with-is unavaluable

        //by attribute contains
        //  element= wd.findElement(By.xpath("//*[contains(@href,'ogi')]"));







    }

    @Test
    public void testPassword(){


    }


    @AfterMethod
    public void postCondition(){
       // wd.close();
        wd.quit();

    }
}
