import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.PrintStream;
import java.util.List;

public class TableTest {
    WebDriver wd;


    @BeforeMethod
    public void init() {
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");

    }
//    @Test
//    public void tableTestCss(){
//        WebElement element = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child"));
//        String text = element.getText();
//       // Assert.assertEquals(text,"Canada");
//       // Assert.assertTrue(text.contains("nad"));
//        System.out.println(text);
//        Assert.assertEquals(text,"Canada");
//        Assert.assertTrue(text.contains("nad"));
//
//    }
    @Test
    public void tableHW(){
        // get row 4 content
       WebElement element = wd.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[last()]"));
       // WebElement element = wd.findElement(By.cssSelector("#customers tr:nth-child(4) td:last-child"));
        String text = element.getText();
        // check if there is text "Mexico" there
        Assert.assertEquals(text,"Mexico");
    }

    @Test
    public void tableHW2(){
        // print amount of table rows
        List<WebElement> elements = wd.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
         System.out.println(elements.size());
        // print amount of table columns
        List<WebElement> elements2 = wd.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
        System.out.println(elements2.size());
       // print content of row3
        List<WebElement> elements3 = wd.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
        for (WebElement e:elements3) {
           System.out.println(e.getText());
        }
        // print content of last column
        WebElement element4 = wd.findElement(By.xpath("//table[@id='customers']/tbody/tr[3]/td[last()]"));
        System.out.println(element4.getText());
        // print number of row with name "Philip Cramer"
        List<WebElement> elements5 = wd.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
       String eText;
       double res = 0.;
       double count=0.;
        for (WebElement e:elements5) {
            count++;
            eText=e.getText();
            if(eText.equals("Philip Cramer")) {
                res=count/3;
                System.out.printf("%.0f", res);
                System.out.println();
            }

        }


    }

  //  @AfterMethod
    //public void tearDown(){
       // wd.quit();
    //}
}