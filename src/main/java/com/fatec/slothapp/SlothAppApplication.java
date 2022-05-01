package com.fatec.slothapp;

import com.fatec.slothapp.api.models.RoleModel;
import com.fatec.slothapp.api.models.UserModel;
import com.fatec.slothapp.domain.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SlothAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlothAppApplication.class, args);
	}

	@Bean
	BCryptPasswordEncoder  passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	/*@Bean
	CommandLineRunner runner(UserService userService){
		return args -> {
			userService.createRole(new RoleModel(null, "ROLE_ADMIN"));
			userService.createRole(new RoleModel(null, "ROLE_USER"));
			userService.createRole(new RoleModel(null, "ROLE_STUDENT"));
			userService.createRole(new RoleModel(null, "ROLE_TEACHER"));

			userService.createUser(new UserModel(null, "Gaddini", "ferreiragaddini@gmail.com", "123456", new ArrayList<>()));

			userService.addRoleToUser("Gaddini", "ROLE_ADMIN");
		};
	}*/

}
