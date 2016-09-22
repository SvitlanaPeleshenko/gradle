

//import com.soap.configuration.JiraBugListener;
//import com.soap.configuration.PassTestListener;
import configuration.PropertyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Listeners;
//import org.uncommons.reportng.listeners.ExceptionListener;
//import org.uncommons.reportng.listeners.ReporterListener;


//@Listeners({JiraBugListener.class, ReporterListener.class, PassTestListener.class, ExceptionListener.class})
@Configuration
public class SoapClientConfig {

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("com.soap");
    return marshaller;
  }

  @Bean
  public CalculatorClient calculatorClient(Jaxb2Marshaller marshaller) {
    CalculatorClient client = new CalculatorClient();
    client.setDefaultUri("http://ws1.parasoft.com/glue/calculator");
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }

  static {
    System.setProperty("org.uncommons.reportng.local-report-directory", PropertyFactory.getInstance().getProperty("report.dir.full"));
    System.setProperty("org.uncommons.reportng.cq-jira-url", "https://ctc-customs.atlassian.net");
    System.setProperty("org.uncommons.reportng.jira-login", "Dmitry Lazarev");
    System.setProperty("org.uncommons.reportng.jira-pass", "12345678");
  }


}
