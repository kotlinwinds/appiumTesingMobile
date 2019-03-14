import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DemoApp {
    private AppiumDriver<MobileElement> driver = null;

    @BeforeTest
    public void SplashScreen() throws MalformedURLException, InterruptedException {
        try {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("deviceName", "oppo");
        capabilities.setCapability(CapabilityType.VERSION, "8.1.0");
       // capabilities.setCapability(MobileCapabilityType.UDID, "NFIVFYAEVWPVFM4D");
        capabilities.setCapability("appPackage", "com.winds.karyakarta");
        capabilities.setCapability("automationName", "uiautomator22");
        capabilities.setCapability("appActivity", "com.winds.karyakarta.ui.new_login.NewLoginActivity");
       // capabilities.setCapability("app","E:\\captain1.apk");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("skipUnlock", true);
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
        Thread.sleep(7000);
        System.out.println("**************App launched********************");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testandroid() throws InterruptedException {

        driver.findElement(By.id("edt_mobile_number")).sendKeys("7415919195");
        Thread.sleep(1000);

        driver.findElement(By.id("edt_password")).sendKeys("saharapranam");
        driver.hideKeyboard();
        Thread.sleep(1000);

        driver.findElement(By.id("btn_login")).click();
        System.out.println("logged in");
        Thread.sleep(1000);

       driver.findElement(By.id("tiles1")).click();
        System.out.println("logged in");
        Thread.sleep(6000);



      /*  driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and @bounds='[36,974][1044,1226]']")).click();
        System.out.println("Clicked on Partners");
        Thread.sleep(4000);*/


        /* driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and @bounds='[36,296][348,656]']")).click();
        System.out.println("Clicked on MyProfile");
        Thread.sleep(4000);
*/
      /*  driver.findElement(By.id("tv_Profile1")).click();
        Thread.sleep(3000);

       driver.findElement(By.id("ib_edit_btn")).click();
        Thread.sleep(2000);
*/

     /*   driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//android.widget.Button[contains(@resource-id,'permission_allow_button')]")).click();
        Thread.sleep(1000);

*/
       /* driver.findElement(By.xpath("//*[@class='android.widget.FrameLayout' and @bounds='[901,80][1080,223]']")).click();
        Thread.sleep(2000);*/

    /*    driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("iv_support")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("iv_support")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("iv_notification")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("tvPersonal")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();
        Thread.sleep(4000);
*/

    }

    @AfterTest
    public void afterclass() {
        driver.quit();
    }
}