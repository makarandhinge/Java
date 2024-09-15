package org.example.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class MainApplications {
    public static void main(String[] args) {
        // Start the Spring Boot application
        ApplicationContext context = SpringApplication.run(MainApplications.class, args);

        // Retrieve the UserService bean from the application context
        UserService userService = context.getBean(UserService.class);

        // Use the UserService to find a user and print their name
        User user = userService.findUserById(1L);
        System.out.println("MainApplication: Found user with name " + user.getName());
    }
}

@Service
class UserService {

    private final UserRepository userRepository;

    // Constructor Injection
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        System.out.println("UserService: UserRepository has been injected via constructor");
    }

    public User findUserById(Long id) {
        System.out.println("UserService: Finding user with ID " + id);
        return userRepository.findById(id);
    }
}



@Repository
class UserRepository {
    public User findById(Long id) {
        // Simulated database fetch
        System.out.println("UserRepository: Fetching user with ID " + id);
        return new User(id, "John Doe");
    }
}
class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


