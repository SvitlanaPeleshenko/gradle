import com.soap.*;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;


public class CalculatorClient extends WebServiceGatewaySupport {

   public CalculatorClient() {
        getWebServiceTemplate().setInterceptors((ClientInterceptor[]) Arrays.asList(clientInterceptor).toArray());
   }

    ClientInterceptor clientInterceptor = new ClientInterceptor() {

        public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {

            FileOutputStream fileOutputStream = null;
           try {
                 fileOutputStream = new FileOutputStream(new File(System.getProperty("user.dir") + "\\out.xml"));
                messageContext.getRequest().writeTo(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return true;
        }

        public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(new File(System.getProperty("user.dir") + "\\resp.xml"));
                messageContext.getResponse().writeTo(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
            }

            return true;
        }

        public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
            return true;
        }

        public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {

        }
    };


    public AddResponse getAddResponse(int x, int y) {
        Add request = new Add();
        request.setX(x);
        request.setY(y);
        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public SubtractResponse getSubtractResponse(int x, int y) {
        Subtract request = new Subtract();
        request.setX(x);
        request.setY(y);

        return (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public DivideResponse getDivideResponse(int x, int y) {
        Divide request = new Divide();
        request.setDenominator(x);
        request.setNumerator(y);
        return (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }

    public MultiplyResponse getMultiplyResponse(int x, int y) {
        Multiply request = new Multiply();
       request.setX(x);
       request.setY(y);
      return (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(request);
    }
}
