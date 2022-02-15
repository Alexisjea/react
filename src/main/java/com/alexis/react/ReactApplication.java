package com.alexis.react;

import com.alexis.react.model.User;
import com.alexis.react.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ReactApplication.class, args);
    }

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        this.userRepository.save(new User("alexis","jean", "alexjean@gmail.fr"));
        this.userRepository.save(new User("ledoo","cassou", "ledoocassou@gmail.fr"));
        this.userRepository.save(new User("tony","parker", "tonyparker@gmail.fr"));

    }
}
