package com.ukd.helloworld;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    // Додавання користувача
    public void addUser(User user) {
        users.add(user);
    }

    // Отримання всіх користувачів
    public List<User> getAllUsers() {
        return users;
    }

    // Ініціалізація кількох користувачів для тесту
    public void initializeUsers() {
        users.add(new User(1L, "Іван Іванов", "ivan@example.com"));
        users.add(new User(2L, "Марія Марієва", "maria@example.com"));
        users.add(new User(3L, "Петро Петров", "petro@example.com"));
    }
}
