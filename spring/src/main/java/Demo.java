
import com.soap.AddResponse;
import com.soap.DivideResponse;
import com.soap.MultiplyResponse;
import com.soap.SubtractResponse;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SoapClientConfig.class);
		CalculatorClient client = context.getBean(CalculatorClient.class);

		AddResponse addResponse = client.getAddResponse(6, 2);
		System.out.println("[+] response: " + addResponse.getResult());

		DivideResponse divideResponse = client.getDivideResponse(6, 2);
		System.out.println("[/] response: " + divideResponse.getResult());

		MultiplyResponse multiplyResponse = client.getMultiplyResponse(6, 2);
		System.out.println("[*] response: " + multiplyResponse.getResult());

		SubtractResponse subtractResponse = client.getSubtractResponse(6, 2);
		System.out.println("[-] response: " + subtractResponse.getResult());
		Assert.isTrue(subtractResponse.getResult()==4.0);
	}

}
