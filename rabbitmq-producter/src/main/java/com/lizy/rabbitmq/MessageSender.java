package com.lizy.rabbitmq;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class MessageSender {
    
    private Logger logger = LoggerFactory.getLogger(MessageSender.class);

    //声明一个队列名字
    private final static String QUEUE_NAME = "hello";
   
    public boolean sendMessage(String message){
        //new一个RabbitMQ的连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置需要连接的RabbitMQ地址，这里指向本机
        factory.setHost("127.0.0.1");
        Connection connection = null;
        Channel channel = null;
        try {
            //尝试获取一个连接
            connection = factory.newConnection();
            //尝试创建一个channel
            channel = connection.createChannel();
            //这里的参数在后面详解
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            int i=0;
            String originalMessage=message;
            while(true){
            	message+=i++;
            	//注意这里调用了getBytes()，发送的其实是byte数组，接收方收到消息后，需要重新组装成String
                channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
                logger.info("Sent '" + message + "'");
                try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                message=originalMessage;
                if(i>2){
                	break;
                }
            }
        } catch (IOException | TimeoutException e) {
            //失败后记录日志，返回false，代表发送失败
            logger.error("send message faild!",e);
        }
        return true;
    }
}