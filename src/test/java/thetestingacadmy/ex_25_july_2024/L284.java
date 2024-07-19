package thetestingacadmy.ex_25_july_2024;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class L284 {

    @Parameters("browser")
    @Test(priority = 1)
    public void testDemo(String value){
        System.out.println("Browser is " + value);
        switch (value){
            case "Firefox":
                System.out.println("Firefox is started and running");
                break;

            case "Chrome":
                System.out.println("Chrome is started and running");
                break;

            default:
                System.out.println("No idea which browser is running");
        }




    }



}
