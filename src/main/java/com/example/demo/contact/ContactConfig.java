package com.example.demo.contact;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ContactConfig {
    @Bean
    CommandLineRunner commandLineRunner(ContactRepository repository)
    {
        return args -> {
            Contact a = new Contact("Julia",503453122);
            Contact b = new Contact("Lujkaz",60892525);
            repository.saveAll(List.of(a,b));
        };
    }
}
