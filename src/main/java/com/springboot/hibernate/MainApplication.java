package com.springboot.hibernate;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class MainApplication {
	static Logger logger=LogManager.getLogger(MainApplication.class);

public static void main(String[] args) {
	logger.info("spring application started");
	SpringApplication.run(MainApplication.class,args);

}
}
