package com.example.user;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

/**
 * 定义starter需要的配置
 */
@Data
@ConfigurationProperties("spring.user")
public class UserProperties {

	private String name;
	
}
