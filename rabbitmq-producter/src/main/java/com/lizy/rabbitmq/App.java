package com.lizy.rabbitmq;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		MessageSender sender = new MessageSender();
		sender.sendMessage("hello RabbitMq!");
	}
}
