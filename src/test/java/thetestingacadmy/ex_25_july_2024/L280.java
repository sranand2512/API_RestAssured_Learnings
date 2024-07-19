package thetestingacadmy.ex_25_july_2024;

import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class L280 {
    // Grouping of the Test Cases
    // 100 - total
    // 20 -P0, 20 - P1, 50 - P2, 10 -P3
    // 40 - smoke, 20 - sanity

    @AllureId("TC01")
    @Severity(SeverityLevel.MINOR)
    @Description("sanity group")
    @Test(groups = {"sanity"}, priority =  1)
    public void SanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
    }


    @Description("Sanity, QA, Reg, Group")
    @Test(groups = {"sanity", "QA", "Reg"})
    public void RegRun(){
        System.out.println("Regression");

    }


    @Description("Smoke Group")
    @Test(groups = {"smoke"}, priority = 2)
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);

    }

    @Description("QA Group")
    @Test(groups = {"sanity", "QA"}, priority = 3)
    public void QARun(){
        System.out.println("QA");

    }

    @Description("Prod Group")
    @Test(groups = {"sanity", "Prod"}, priority =  2)
    public void ProdRun(){
        System.out.println("Production");

    }


}
