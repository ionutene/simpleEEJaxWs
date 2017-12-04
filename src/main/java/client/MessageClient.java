package client;

import utilitary.Message;
import utilitary.MessageImplService;

public class MessageClient {

	public static void main(String[] args) {

		MessageImplService messagingService = new MessageImplService();
		Message message = messagingService.getMessageImplPort();

		System.out.println(message.getMessageAsString("Message # 1. "));

	}

}
