package utilitary;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "MessageImplService", targetNamespace = "http://utilitary/", wsdlLocation =
		"http://localhost:8080/utilitary/message?wsdl")
public class MessageImplService extends Service {

	private final static URL HELLOWORLDIMPLSERVICE_WSDL_LOCATION;
	private final static WebServiceException HELLOWORLDIMPLSERVICE_EXCEPTION;
	private final static QName HELLOWORLDIMPLSERVICE_QNAME = new QName("http://utilitary/", "MessageImplService");

	static {
		URL url = null;
		WebServiceException e = null;
		try {
			url = new URL("http://localhost:8080/utilitary/message?wsdl");
		} catch (MalformedURLException ex) {
			e = new WebServiceException(ex);
		}
		HELLOWORLDIMPLSERVICE_WSDL_LOCATION = url;
		HELLOWORLDIMPLSERVICE_EXCEPTION = e;
	}

	public MessageImplService() {
		super(__getWsdlLocation(), HELLOWORLDIMPLSERVICE_QNAME);
	}

	public MessageImplService(WebServiceFeature... features) {
		super(__getWsdlLocation(), HELLOWORLDIMPLSERVICE_QNAME, features);
	}

	public MessageImplService(URL wsdlLocation) {
		super(wsdlLocation, HELLOWORLDIMPLSERVICE_QNAME);
	}

	public MessageImplService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, HELLOWORLDIMPLSERVICE_QNAME, features);
	}

	public MessageImplService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public MessageImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	private static URL __getWsdlLocation() {
		if (HELLOWORLDIMPLSERVICE_EXCEPTION != null) {
			throw HELLOWORLDIMPLSERVICE_EXCEPTION;
		}
		return HELLOWORLDIMPLSERVICE_WSDL_LOCATION;
	}

	@WebEndpoint(name = "MessageImplPort")
	public Message getMessageImplPort() {
		return super.getPort(new QName("http://utilitary/", "MessageImplPort"), Message.class);
	}

	@WebEndpoint(name = "MessageImplPort")
	public Message getMessageImplPort(WebServiceFeature... features) {
		return super.getPort(new QName("http://utilitary/", "MessageImplPort"), Message.class, features);
	}

}
