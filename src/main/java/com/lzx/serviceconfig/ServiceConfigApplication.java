package com.lzx.serviceconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import java.util.TimeZone;

@SpringBootApplication
@EnableConfigServer
public class ServiceConfigApplication {

	public static void main(String[] args) {
		TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
		SpringApplication.run(ServiceConfigApplication.class, args);
	}
}
