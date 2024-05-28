package com.fastcampus.projectboard;

import config.ThymeleafConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ThymeleafConfig.Thymeleaf3Properties.class)
public class FastCampusProjectBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastCampusProjectBoardApplication.class, args);
	}

}
