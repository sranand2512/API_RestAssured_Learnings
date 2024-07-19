package thetestingacadmy.ex_25_july_2024.Listeners;

import org.testng.IExecutionListener;
import org.testng.ISuiteListener;

public class CustomListener implements IExecutionListener, ISuiteListener {

    @Override
    public void onExecutionStart() {
        System.out.println("On Execution Start");
        long startTime = System.currentTimeMillis();
        System.out.println("Started Execution on :" + startTime);

    }

    @Override
    public void onExecutionFinish() {
        System.out.println("On Execution Finish");
        long endTime = System.currentTimeMillis();
        System.out.println("Started Execution on :" + endTime);

    }
}
