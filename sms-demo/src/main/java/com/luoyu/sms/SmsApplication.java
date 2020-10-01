package com.luoyu.sms;

import com.github.jackieonway.sms.annotion.EnabledSmsAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnabledSmsAutoConfiguration
@SpringBootApplication
public class SmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsApplication.class, args);
	}

}