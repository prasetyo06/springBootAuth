package com.dev.SimplePos;

import com.dev.SimplePos.Models.RegisterRequest;
import com.dev.SimplePos.Services.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.dev.SimplePos.Entities.Role.ADMIN;

@SpringBootApplication
public class SimplePosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplePosApplication.class, args);
	}
//	@Bean
//	public CommandLineRunner commandLineRunner(
//			AuthenticationService service
//	) {
//		return args -> {
//			var admin = RegisterRequest.builder()
//					.name("Admin")
//					.email("admin@mail.com")
//					.password("password")
//					.role(ADMIN)
//					.build();
//			System.out.println("Admin token: " + service.register(admin).getToken());
//
//		};
//	}

}
