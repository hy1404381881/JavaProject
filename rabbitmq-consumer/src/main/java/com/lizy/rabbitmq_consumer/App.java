package com.lizy.rabbitmq_consumer;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String QUEUE_NAME ="hello";
    public static void main( String[] args )
    {
        MessageConsumer consumer1=new MessageConsumer();
        consumer1.consume(QUEUE_NAME);
        MessageConsumer consumer2=new MessageConsumer();
        consumer2.consume(QUEUE_NAME);
        MessageConsumer consumer3=new MessageConsumer();
        consumer3.consume(QUEUE_NAME);
        MessageConsumer consumer4=new MessageConsumer();
        consumer4.consume(QUEUE_NAME);
        MessageConsumer consumer5=new MessageConsumer();
        consumer5.consume(QUEUE_NAME);
    }
}
