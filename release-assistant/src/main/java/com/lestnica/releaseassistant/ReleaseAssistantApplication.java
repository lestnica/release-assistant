package com.lestnica.releaseassistant;

import com.lestnica.releaseassistant.config.TelegramProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@EnableConfigurationProperties(TelegramProperties.class)
@SpringBootApplication
public class ReleaseAssistantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReleaseAssistantApplication.class, args);
	}

}
