package com.mrc.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@SpringBootConfiguration
@ComponentScan({"com.mrc.controller"})
public class MrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MrcApplication.class, args);
	}
}
