package com.yutong.debug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = { "com.yutong.debug.dao" })
public class DebugApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebugApplication.class, args);
	}
}
