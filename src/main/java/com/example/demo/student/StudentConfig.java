package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student paul = new Student(
                    "Paul",
                    "paul@example.com",
                    LocalDate.of(2000, DECEMBER, 5),
                    21);
            Student walker = new Student(
                    "Walker",
                    "walker@example.com",
                    LocalDate.of(2001, JUNE, 5),
                    20);

            repository.saveAll(List.of(paul,walker));
        };
    }
}
