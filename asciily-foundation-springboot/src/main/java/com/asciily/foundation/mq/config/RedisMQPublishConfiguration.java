package com.asciily.foundation.mq.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

import com.asciily.foundation.mq.pubsub.impl.RedisMQPublisher;

/**
 * @author kakashi
 * @since 2018年10月22日
 */
@Configurable
public class RedisMQPublishConfiguration {

	@Bean
	RedisMQPublisher redisMQPublisher(RedisTemplate<String, Object> redisTemplate) {
		RedisMQPublisher publish = new RedisMQPublisher();
		publish.setRedisTemplate(redisTemplate);
		return publish;
	}

}
