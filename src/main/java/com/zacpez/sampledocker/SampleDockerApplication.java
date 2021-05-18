package com.zacpez.sampledocker;

import com.zacpez.sampledocker.model.User;
import com.zacpez.sampledocker.model.UserRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.ParseException;
import java.util.stream.Stream;

@SpringBootApplication
public class SampleDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleDockerApplication.class, args);
	}

	@Bean
	ApplicationRunner init(UserRepository repository) {

		String[][] data = {
				{"Bob", "Andrew", "5"},
				{"Bill", "Andrew", "4"},
				{"Jane", "Andrew", "88"}
		};

		return args -> {
			Stream.of(data).forEach(array -> {
				try {
					User user = new User();
					user.setFirstName(array[0]);
					user.setLastName(array[1]);
					user.setAge(Integer.parseInt(array[2]));
					repository.save(user);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
