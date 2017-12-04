package endpoint;

import utilitary.MessageImpl;
import javax.xml.ws.Endpoint;

//Endpoint publisher
public class MessagePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/utilitary/message", new MessageImpl());
	}

}
