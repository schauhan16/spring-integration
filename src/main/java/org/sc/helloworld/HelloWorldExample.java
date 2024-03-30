package org.sc.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldExample {

	public static void main(String[] args) {
		String cfg = "classpath:helloworld-context.xml";

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(cfg)) {
			System.out.println("Using Gateway");

			HelloService service = context.getBean("helloGateway", HelloService.class);

			System.out.println(service.sayHello("World"));
		}

		// Using Message Channel

		// System.out.println("Using Message Channel");
		//
		// MessageChannel channel = context.getBean("names", MessageChannel.class);
		//
		// channel.send(MessageBuilder.withPayload("World").build())
	}

}