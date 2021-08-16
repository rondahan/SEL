import org.jsoup.nodes.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ronda\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://portal.aac.ac.il");
        // identify element
        driver.findElement(By.id("Ecom_User_ID")).sendKeys("rondhn1");
        driver.findElement(By.id("Ecom_Password")).sendKeys("8660456Rr");
        driver.findElement(By.id("wp-submit")).click();
        driver.findElement(By.linkText("מערכת Moodle")).click();
        Point p = new Point(0, 3000);
        driver.manage().window().setPosition(p);
        List<WebElement> text = driver.findElements(By.className("row-fluid"));

        for (WebElement webElement : text) {
            String name = webElement.getText();
            System.out.println(name);

            int choise;

             System.out.println("which coruse to enter (only number)");
             Scanner scanner = new Scanner(System.in);
             choise=scanner.nextInt();
             try {
                 switch (choise) {
                     case 1:
                         driver.findElement(By.tagName("  הבעה עברית- מתוקשב 31 80 81 (ר\"ת)")).click();
                     case 2:
                         driver.findElement(By.id("28064")).click();
                     case 3:
                         driver.findElement(By.id("")).click();
                     case 4:
                         driver.findElement(By.id("29043")).click();
                     case 5:
                         driver.findElement(By.id("29447")).click();
                     case 6:
                         driver.findElement(By.id("28199")).click();
                     default:
                         System.out.println("null");

                 }
             }catch (InputMismatchException exception){
                 System.out.println("only numbers");

                    }



            driver.findElement(By.id("action-menu-toggle-1")).click();
             driver.findElement(By.className("dropdown-item menu-action")).click();
            driver.findElement(By.className("glyphicon glyphicon-log-out")).click();

            }
        }
    }
