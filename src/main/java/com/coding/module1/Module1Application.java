package com.coding.module1;

import com.coding.module1.Impl.EmailNotificationService;
import com.coding.module1.Impl.SmsNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class Module1Application implements CommandLineRunner {

//	@Autowired
//	private PaymentService paymentService;

	//@Autowired
//	final NotificationService notificationService;
//
//	public Module1Application(NotificationService notificationService){
//		this.notificationService = notificationService;
//	}
	@Autowired
	Map<String, NotificationService> notificationServiceMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(Module1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		//	paymentService.pay();
		// notificationService.send("hello");
		for(var notificationService : notificationServiceMap.entrySet()){
			System.out.println(notificationService.getKey());
			notificationService.getValue().send("Hello");
		}
	}
}
