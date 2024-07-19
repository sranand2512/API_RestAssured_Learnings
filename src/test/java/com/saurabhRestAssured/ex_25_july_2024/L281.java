package com.saurabhRestAssured.ex_25_july_2024;

import org.testng.annotations.Test;

public class L281 {
    @Test
    public void serverStartedOK(){
        System.out.println("I will run first");
    }

    @Test(dependsOnMethods = "serverStartedOK")
    public void methodOne(){
        System.out.println("Method One");
    }


}
