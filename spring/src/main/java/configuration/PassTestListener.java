package configuration;

//import com.soap.annotations.TestInfo;
/*
import org.testng.IExecutionListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.io.*;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.join;

//import static com.epam.qa.configuration.PropertyFactory.getInstance;


public class PassTestListener implements IInvokedMethodListener, IExecutionListener {

    private static List<String> TESTS = new ArrayList<>();
    private static String SEPERATOR = " or ";

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        Method testMethod = method.getTestMethod().getConstructorOrMethod().getMethod();
        if (method.isTestMethod() && testMethod.isAnnotationPresent(TestInfo.class) && testResult.isSuccess()) {
            TESTS.add(join(testMethod.getDeclaredAnnotation(TestInfo.class).testIds(), SEPERATOR));
        }
    }

    @Override
    public void onExecutionStart() {
    }

    @Override
    public void onExecutionFinish() {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("./report/pass.txt"), "utf-8"));) {
            writer.write(join(TESTS, SEPERATOR));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
*/
