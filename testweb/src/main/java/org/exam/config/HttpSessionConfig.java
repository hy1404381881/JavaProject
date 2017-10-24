package org.exam.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
/**
 * Created by xin on 15/1/23.
 */
@Configuration
@EnableRedisHttpSession
public class HttpSessionConfig {
	@Bean
	public JedisConnectionFactory jedisConnectionFactory() {
		JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
		jedisConnectionFactory.setHostName("192.168.5.137");
		jedisConnectionFactory.setPort(6379);
		return jedisConnectionFactory;
	}
}
