package base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {
    public AndroidDriver driver;

    @BeforeTest
    public void setup() throws MalformedURLException {
//cmd commands
//        1-Mycurrent app command : adb shell dumpsys window | find "mCurrentFocus"
//        2-device name : adb devices

        DesiredCapabilities dC = new DesiredCapabilities() ;
        dC.setCapability("deviceName","AXPMVB1C07001671");
        dC.setCapability("appPackage","com.morecreatives.wepunch");
        dC.setCapability("appActivity","com.morecreatives.wepunch.MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dC);


    }
}
