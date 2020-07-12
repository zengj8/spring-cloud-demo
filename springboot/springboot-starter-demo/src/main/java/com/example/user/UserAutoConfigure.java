package com.example.user;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 */
@Configuration
@EnableConfigurationProperties(UserProperties.class)
public class UserAutoConfigure {

	/**
	 * spring.user.enabled=true 才会装配
	 * @param userProperties
	 * @return
	 */
	@Bean
	@ConditionalOnProperty(prefix = "spring.user", value = "enabled", havingValue = "true")
	public UserClient userClient(UserProperties userProperties) {
		return new UserClient(userProperties);
	}
	
}
