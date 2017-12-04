package utilitary;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;

@WebService(name = "Message", targetNamespace = "http://utilitary/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Message {

	@WebMethod
	@WebResult(partName = "return")
	@Action(input = "http://utilitary/Message/getMessageAsStringRequest", output = "http://utilitary/Message/getMessageAsStringResponse")
	public String getMessageAsString(@WebParam(name = "arg0", partName = "arg0") String arg0);

}
