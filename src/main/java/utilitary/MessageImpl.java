package utilitary;


import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "utilitary.Message")
public class MessageImpl implements Message {

	@Override
	public String getMessageAsString(String name) {
		return "The input hardCoded message is: " + name;

	}
}
