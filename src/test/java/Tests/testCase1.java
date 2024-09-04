package Tests;

import base.baseTest;
import org.testng.annotations.Test;

public class testCase1 extends baseTest {

    @Test(priority = 1)
    public void firstRun()
    {
        System.out.println("==================>   im here ");
    }

}
