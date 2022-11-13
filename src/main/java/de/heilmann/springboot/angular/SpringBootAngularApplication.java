package de.heilmann.springboot.angular;

import de.heilmann.springboot.angular.template.application.UserRepository;
import de.heilmann.springboot.angular.template.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAngularApplication.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            User user = new User(name, name.toLowerCase() + "@domain.com");
            userRepository.save(user);
        });
    }
}