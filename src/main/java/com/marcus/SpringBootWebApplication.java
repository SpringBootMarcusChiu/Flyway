package com.marcus;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootWebApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(final PersonRepository repository) {
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                System.err.println(repository.findAll());
            }

        };
    }
}