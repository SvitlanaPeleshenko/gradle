package configuration;


//import com.soap.annotations.TestInfo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
/*import org.testng.IInvokedMethod;
import org.testng.ITestResult;

import org.uncommons.reportng.models.Bug;
import org.uncommons.reportng.services.ReportingService;

import org.uncommons.reportng.listeners.ExceptionListener;


public class JiraBugListener extends ExceptionListener {
    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        if (method.getTestMethod().getConstructorOrMethod().getMethod().isAnnotationPresent(TestInfo.class)) {
            String[] strings = method.getTestMethod().getConstructorOrMethod().getMethod().getAnnotation(TestInfo.class).testIds();
            testResult.setAttribute(Bug.TEST_CASE_NAME, StringUtils.join(strings, " or "));
        }else {
            testResult.setAttribute(Bug.TEST_CASE_NAME, StringUtils.EMPTY);
        }
    }
}*/
